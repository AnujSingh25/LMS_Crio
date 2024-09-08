package com.crio.lms.services;

import java.util.List;

import com.crio.lms.dto.Exam;
import com.crio.lms.exceptions.ExamNotFoundException;
import com.crio.lms.exceptions.SubjectNotFoundException;
import com.crio.lms.exchanges.CreateExamRequest;

public interface ExamService {
    
    Exam createExam(CreateExamRequest createExamRequest) throws SubjectNotFoundException;

    Exam findExamById(long examId) throws ExamNotFoundException;

    List<Exam> findAllExams();

    void deleteExam(long examId) throws ExamNotFoundException;
    
}
