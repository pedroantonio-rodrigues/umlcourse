package com.pedro.umlcourse.umlcourse.repositories;

import com.pedro.umlcourse.umlcourse.domain.Address;
import com.pedro.umlcourse.umlcourse.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    
}
