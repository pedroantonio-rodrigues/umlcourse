package com.pedro.umlcourse.umlcourse.service;

import com.pedro.umlcourse.umlcourse.domain.Order;
import com.pedro.umlcourse.umlcourse.repositories.OrderRepository;
import com.pedro.umlcourse.umlcourse.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order search(Integer id){
        Optional<Order> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! id: " + id + ", type: " + Order.class.getName()));


    }
    
}
