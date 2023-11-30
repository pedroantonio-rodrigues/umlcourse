package com.pedro.umlcourse.umlcourse.repositories;

import com.pedro.umlcourse.umlcourse.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    
}
