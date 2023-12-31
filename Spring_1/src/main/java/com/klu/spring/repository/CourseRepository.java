package com.klu.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.spring.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
