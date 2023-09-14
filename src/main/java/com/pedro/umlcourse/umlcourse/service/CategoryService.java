package com.pedro.umlcourse.umlcourse.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.umlcourse.umlcourse.domain.Category;
import com.pedro.umlcourse.umlcourse.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Optional<Category> search(Integer id){
        Optional<Category> obj = repository.findById(id);
        return obj;


    }
    
}
