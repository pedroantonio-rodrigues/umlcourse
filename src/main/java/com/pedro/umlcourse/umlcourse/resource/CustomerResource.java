package com.pedro.umlcourse.umlcourse.resource;

import com.pedro.umlcourse.umlcourse.domain.Customer;
import com.pedro.umlcourse.umlcourse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerResource {
    
    @Autowired
    private CustomerService service;

    @RequestMapping(  value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Customer obj = service.search(id);
        return ResponseEntity.ok().body(obj);

    }

    
}
