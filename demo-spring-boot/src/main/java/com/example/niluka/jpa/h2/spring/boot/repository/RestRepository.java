package com.example.niluka.jpa.h2.spring.boot.repository;

import com.example.niluka.jpa.h2.spring.boot.model.RestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.config.CustomRepositoryImplementationDetector;

/**
 * Initiate database request
 */
public interface RestRepository extends CrudRepository<RestModel,Integer> {

    RestModel getById(Integer id);
}
