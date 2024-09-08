package com.crio.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.lms.dto.Subject;
import com.crio.lms.exceptions.SubjectNotFoundException;
import com.crio.lms.exchanges.CreateSubjectRequest;
import com.crio.lms.repositoryServices.SubjectRepositoryService;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepositoryService subjectRepositoryService;

    @Override
    public Subject createSubject(CreateSubjectRequest createSubjectRequest) {
        String subjectName = createSubjectRequest.getSubjectName();
        Subject subject = subjectRepositoryService.createSubject(subjectName);
        return subject;
    }

    @Override
    public Subject findSubjectById(long subjectId) throws SubjectNotFoundException {
        Subject subject = subjectRepositoryService.findSubjectById(subjectId);
        return subject;
    }

    @Override
    public List<Subject> findAllSubjects() {
        List<Subject> subjects = subjectRepositoryService.findAllSubjects();
        return subjects;
    }

    @Override
    public void deleteSubject(long subjectId) throws SubjectNotFoundException {
       subjectRepositoryService.deleteSubject(subjectId);
    }
    
}
