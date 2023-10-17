package com.pedro.umlcourse.umlcourse.repositories;

import com.pedro.umlcourse.umlcourse.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}
