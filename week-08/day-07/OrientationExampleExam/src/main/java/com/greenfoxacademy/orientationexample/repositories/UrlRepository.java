package com.greenfoxacademy.orientationexample.repositories;

import com.greenfoxacademy.orientationexample.models.UrlAlias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends CrudRepository<UrlAlias, String> {
}
