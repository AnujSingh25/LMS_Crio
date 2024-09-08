package com.crio.lms.services;

import java.util.List;

import com.crio.lms.dto.Subject;
import com.crio.lms.exceptions.SubjectNotFoundException;
import com.crio.lms.exchanges.CreateSubjectRequest;

public interface SubjectService {

    Subject createSubject(CreateSubjectRequest createSubjectRequest);

    Subject findSubjectById(long subjectId) throws SubjectNotFoundException;

    List<Subject> findAllSubjects();

    void deleteSubject(long subjectId) throws SubjectNotFoundException;

}
