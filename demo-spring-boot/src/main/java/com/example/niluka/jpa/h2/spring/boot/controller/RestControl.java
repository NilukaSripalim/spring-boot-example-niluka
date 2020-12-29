package com.example.niluka.jpa.h2.spring.boot.controller;

import com.example.niluka.jpa.h2.spring.boot.model.RestModel;
import com.example.niluka.jpa.h2.spring.boot.service.RestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Maintain all Endpoints.
 */
@RestController
@RequestMapping("/api")
public class RestControl {

    @Autowired
    private RestServices restServices;

    @PostMapping("/add")
    public RestModel addOrUpdateRecord(@RequestBody RestModel restModel) {
        return restServices.addBLMethod(restModel);
    }
    @GetMapping("/all")
    public Iterable<RestModel> findAll() {
        return restServices.findAll();
    }
    @GetMapping("/find/{id}")
    public RestModel findById(@PathVariable Integer id) {
        return restServices.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeRecord(@PathVariable Integer id) {
        RestModel restModelRm = restServices.findById(id);
        restServices.deleteById(restModelRm);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }
}
