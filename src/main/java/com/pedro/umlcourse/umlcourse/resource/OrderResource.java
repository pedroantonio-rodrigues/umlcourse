package com.pedro.umlcourse.umlcourse.resource;

import com.pedro.umlcourse.umlcourse.domain.Category;
import com.pedro.umlcourse.umlcourse.domain.Order;
import com.pedro.umlcourse.umlcourse.service.CategoryService;
import com.pedro.umlcourse.umlcourse.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    
    @Autowired
    private OrderService service;

    @RequestMapping(  value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Order obj = service.search(id);
        return ResponseEntity.ok().body(obj);

    }

    
}
