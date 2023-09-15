package com.pedro.umlcourse.umlcourse.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.umlcourse.umlcourse.domain.Category;
import com.pedro.umlcourse.umlcourse.repositories.CategoryRepository;
import com.pedro.umlcourse.umlcourse.service.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category search(Integer id){
        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! id: " + id + ", type: " + Category.class.getName()));


    }
    
}
