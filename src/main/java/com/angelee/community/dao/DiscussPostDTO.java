package com.angelee.community.dao;

import com.angelee.community.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class DiscussPostDTO {
    private Long id;
    private Long userId;
    private String title;
    private String content;
    private Integer type;
    private Integer status;
    private Date createTime;
    private Integer commentCount;
    private Integer likeCount;
    private Double score;
    private User user;

}
