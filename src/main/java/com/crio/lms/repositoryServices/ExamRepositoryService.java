package com.crio.lms.repositoryServices;

import java.util.List;

import com.crio.lms.dto.Exam;
import com.crio.lms.exceptions.ExamNotFoundException;
import com.crio.lms.exceptions.SubjectNotFoundException;

public interface ExamRepositoryService {
    Exam createExam(long subjectId) throws SubjectNotFoundException;

    Exam findExamById(long examId) throws ExamNotFoundException;

    List<Exam> findAllExams();

    void deleteExam(long examId) throws ExamNotFoundException;
}
