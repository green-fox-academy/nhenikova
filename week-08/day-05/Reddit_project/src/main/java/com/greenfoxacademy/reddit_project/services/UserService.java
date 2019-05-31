package com.greenfoxacademy.reddit_project.services;

import com.greenfoxacademy.reddit_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserRepository repoUser;

    @Autowired
    public UserService(UserRepository repoUser) {
        this.repoUser = repoUser;
    }
}
