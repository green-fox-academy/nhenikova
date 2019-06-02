package com.greenfoxacademy.orientationexample.repositories;

import com.greenfoxacademy.orientationexample.models.UrlAlias;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlRepository extends CrudRepository<UrlAlias, String> {

    @Query(value = "SELECT * FROM lovely_alias al WHERE al.alias = ?1", nativeQuery = true)
        //independent query
    Optional<UrlAlias> getItemByAlias(String alias); //turned into a query in the background, the same naming = same syntax

    //custom query select all from UrlAlias where it is equal to the first parameter
}