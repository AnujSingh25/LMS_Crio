package com.crio.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.lms.dto.Exam;
import com.crio.lms.exceptions.ExamNotFoundException;
import com.crio.lms.exceptions.SubjectNotFoundException;
import com.crio.lms.exchanges.CreateExamRequest;
import com.crio.lms.repositoryServices.ExamRepositoryService;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepositoryService examRepositoryService;

    @Override
    public Exam createExam(CreateExamRequest createExamRequest) throws SubjectNotFoundException {
        long subjectId = createExamRequest.getSubjectId();
        Exam exam = examRepositoryService.createExam(subjectId);
        return exam;
    }

    @Override
    public Exam findExamById(long examId) throws ExamNotFoundException {
        Exam exam = examRepositoryService.findExamById(examId);
        return exam;
    }

    @Override
    public List<Exam> findAllExams() {
        List<Exam> exams = examRepositoryService.findAllExams();
        return exams;
    }

    @Override
    public void deleteExam(long examId) throws ExamNotFoundException {
        examRepositoryService.deleteExam(examId);
    }
    
}
