package com.angelee.community.service;

import com.angelee.community.dao.DiscussPostDTO;
import com.angelee.community.entity.DiscussPost;
import com.angelee.community.entity.DiscussPostExample;
import com.angelee.community.entity.User;
import com.angelee.community.entity.UserExample;
import com.angelee.community.mapper.DiscussPostMapper;
import com.angelee.community.mapper.UserMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Autowired
    private UserMapper userMapper;

    public Integer findDiscussPostRows(Long userId) {
        if (userId==null){
            // 返回所有帖子
            return discussPostMapper.selectByExample(new DiscussPostExample()).size();
        }else{
            // 返回userId发布的所有帖子
            DiscussPostExample discussPostExample = new DiscussPostExample();
            discussPostExample.createCriteria()
                    .andUserIdEqualTo(userId);
            return discussPostMapper.selectByExample(discussPostExample).size();
        }
    }

    public List<DiscussPostDTO> findDiscussPost(int offset, int limit) {

        DiscussPostExample discussPostExample = new DiscussPostExample();
        discussPostExample.createCriteria(); // 这里对应的id是发布者的id，不是帖子本身的id
        List<DiscussPost> discussPosts = discussPostMapper.selectByExampleWithRowbounds(discussPostExample, new RowBounds(offset, limit));
        if(discussPosts.size()==0){
            // 没有评论
            return new ArrayList<>();
        }
        // 使用lambda函数编程获取去重后的评论人，使用map和set
        Set<Long> discussposters = discussPosts.stream().map(DiscussPost::getUserId).collect(Collectors.toSet());
        List<Long> userIds = new ArrayList<>();
        userIds.addAll(discussposters);

        // 获取评论人并转换为map
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIn(userIds);
        List<User> users = userMapper.selectByExample(userExample);
        Map<Long, User> userMap = users.stream().collect(Collectors.toMap(User::getId, user -> user));

        // 转换comment为commentDTO
        List<DiscussPostDTO> discussPostDTOS = discussPosts.stream().map(discussPost -> {
            DiscussPostDTO discussPostDTO = new DiscussPostDTO();
            BeanUtils.copyProperties(discussPost, discussPostDTO);
            discussPostDTO.setUser(userMap.get(discussPost.getUserId()));
            return discussPostDTO;
        }).toList();

        return discussPostDTOS;
    }
}
