package com.crio.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.lms.models.ExamEntity;

public interface ExamRepository extends JpaRepository<ExamEntity, Long> {
    
}
