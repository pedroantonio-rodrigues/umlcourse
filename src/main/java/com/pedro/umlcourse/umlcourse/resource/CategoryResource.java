package com.pedro.umlcourse.umlcourse.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.umlcourse.umlcourse.domain.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @RequestMapping(method = RequestMethod.GET)
    public String listar(){

        Category cat1 = new Category(1, "Informatica");
        Category cat2 = new Category(2, "Escritorio");

         List<Category> list = new ArrayList<>();   

         list.add(cat1);
         list.add(cat2);

        return  "Rest are working";
    }

    
}
