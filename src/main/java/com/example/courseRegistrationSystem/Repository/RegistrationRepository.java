package com.example.courseRegistrationSystem.Repository;

import com.example.courseRegistrationSystem.Entity.Registration;
import com.example.courseRegistrationSystem.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
    List<Registration> findByUserId(Long userId);
    List<Registration> findByCourseId(Long courseId);
    boolean existsByUserIdAndCourseId(Long userId, Long courseId);
    long countByCourseIdAndStatus(Long courseId, Status status);
}
