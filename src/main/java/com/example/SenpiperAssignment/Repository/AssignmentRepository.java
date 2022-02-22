package com.example.SenpiperAssignment.Repository;

import com.example.SenpiperAssignment.Model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, String> {
}
