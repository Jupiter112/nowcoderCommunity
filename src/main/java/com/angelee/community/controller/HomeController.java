package com.angelee.community.controller;

import com.angelee.community.dao.DiscussPostDTO;
import com.angelee.community.entity.Page;
import com.angelee.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private DiscussPostService discussPostService;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){
        // SpringMVC会自动实例化model和page，并将page注入model
        page.setPath("/index");
        page.setTotalRows(discussPostService.findDiscussPostRows(null));
        List<DiscussPostDTO> discussPosts = discussPostService.findDiscussPost(page.getOffset(), page.getLimit());
        model.addAttribute("discussPosts", discussPosts);
        return "index";
    }
}
