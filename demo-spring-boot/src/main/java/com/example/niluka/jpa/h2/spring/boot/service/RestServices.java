package com.example.niluka.jpa.h2.spring.boot.service;

import com.example.niluka.jpa.h2.spring.boot.controller.RestControl;
import com.example.niluka.jpa.h2.spring.boot.model.RestModel;
import com.example.niluka.jpa.h2.spring.boot.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Handle Business logic.
 */
@Service
public class RestServices {

    @Autowired
    private RestRepository restRepository;
    public RestModel addBLMethod(RestModel restModel) {

        return restRepository.save(restModel);
    }

    public Iterable<RestModel> findAll() {

        return restRepository.findAll();
    }

    public RestModel findById(Integer id){
        return restRepository.getById(id);
    }

    public void deleteById(RestModel restModel) {
        restRepository.delete(restModel);
    }
}
