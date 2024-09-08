package com.crio.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.lms.models.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    
}
