package com.example.assignmentinternship.repository;

import com.example.assignmentinternship.entity.Load;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoadRepository extends JpaRepository<Load, Long> {
    List<Load> findByShipperId(String shipperId);

}
