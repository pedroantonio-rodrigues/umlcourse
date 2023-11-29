package com.pedro.umlcourse.umlcourse.repositories;

import com.pedro.umlcourse.umlcourse.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    
}
