package com.greenfoxacademy.reddit_project.services;

import com.greenfoxacademy.reddit_project.models.Post;
import com.greenfoxacademy.reddit_project.repositories.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.debugger.Page;

@Service
public class PostService {

    private PostRepository repoPost;

    @Autowired
    public PostService(PostRepository repoPost) {
        this.repoPost = repoPost;
    }

    public void savePost(Post post) {
        repoPost.save(post);
    }

    public void upVotePost(Long id) {
        Post post = repoPost.findById(id).get();
        post.upVote();
        repoPost.save(post);
    }

    public void downVotePost(Long id) {
        Post post = repoPost.findById(id).get();
        post.downVote();
        repoPost.save(post);
    }

    public Post getPostById(Long id) {
        return repoPost.findById(id).get();
    }

//    public Page<Post> getPagePosts(int page) {
//        return repoPost.findAll(new PageRequest(age, 10, Sort.by("score").descending()));
//    }
}
