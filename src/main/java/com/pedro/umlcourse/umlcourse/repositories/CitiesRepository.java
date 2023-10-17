package com.pedro.umlcourse.umlcourse.repositories;

import com.pedro.umlcourse.umlcourse.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends JpaRepository<City, Integer> {
}
