package com.crio.lms.repositoryServices;

import java.util.List;

import com.crio.lms.dto.Subject;
import com.crio.lms.exceptions.SubjectNotFoundException;

public interface SubjectRepositoryService {

    Subject createSubject(String subjectName);

    Subject findSubjectById(long subjectId) throws SubjectNotFoundException;

    List<Subject> findAllSubjects();

    void deleteSubject(long subjectId) throws SubjectNotFoundException;
}
