package com.greenfoxacademy.reddit_project.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="redditsite")
public class RedditSite {

    @Id
    private long id;
}
