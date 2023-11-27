package com.pedro.umlcourse.umlcourse.service;

import com.pedro.umlcourse.umlcourse.domain.Customer;
import com.pedro.umlcourse.umlcourse.repositories.CustomerRepository;
import com.pedro.umlcourse.umlcourse.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer search(Integer id){
        Optional<Customer> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! id: " + id + ", type: " + Customer.class.getName()));


    }
    
}
