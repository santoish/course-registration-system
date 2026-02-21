package com.example.courseRegistrationSystem.repository;

import com.example.courseRegistrationSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {

}
