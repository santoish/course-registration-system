package com.example.courseRegistrationSystem.repository;

import com.example.courseRegistrationSystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
