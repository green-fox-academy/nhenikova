package com.greenfoxacademy.reddit_project.repositories;

import com.greenfoxacademy.reddit_project.models.RedditSite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RedditRepository extends CrudRepository<RedditSite, Long> {
}
