package com.greenfoxacademy.orientationexample.services;

import com.greenfoxacademy.orientationexample.models.Link;
import javassist.NotFoundException;

public interface AliasingService {
    Link save(Link link);

    Link findByAlias(String alias);

    Iterable<Link> getEveryLink();

    void deleteLink(long id, String secretCode) throws NotFoundException;
}
