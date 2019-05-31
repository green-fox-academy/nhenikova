package com.greenfoxacademy.reddit_project.controllers;

import com.greenfoxacademy.reddit_project.services.PostService;
import com.greenfoxacademy.reddit_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedditController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public RedditController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }


}
