package com.pedro.umlcourse.umlcourse.repositories;
import com.pedro.umlcourse.umlcourse.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
