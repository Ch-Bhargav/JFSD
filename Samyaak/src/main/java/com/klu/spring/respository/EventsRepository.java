package com.klu.spring.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.spring.entity.*;
@Repository
public interface EventsRepository extends JpaRepository<Events, Long> {

}
