package com.crio.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.lms.models.SubjectEntity;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
    
}
