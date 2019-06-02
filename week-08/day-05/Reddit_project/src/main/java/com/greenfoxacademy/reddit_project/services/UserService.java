package com.greenfoxacademy.reddit_project.services;

import com.greenfoxacademy.reddit_project.models.User;
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

    public void createUser(String username) {
       repoUser.save(new User(username));
    }

    public void saveUser(User user) {
        repoUser.save(user);
    }

    public User getUser(Long id) {
        return repoUser.findById(id)
    }
}
