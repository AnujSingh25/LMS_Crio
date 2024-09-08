package com.crio.lms.repositoryServices;

import java.util.List;

import com.crio.lms.dto.Student;
import com.crio.lms.exceptions.ExamNotFoundException;
import com.crio.lms.exceptions.StudentNotFoundException;
import com.crio.lms.exceptions.SubjectNotEnrolledException;
import com.crio.lms.exceptions.SubjectNotFoundException;

public interface StudentRepositoryService {

    Student createStudent(String studentName);

    Student findStudentById(long studentId) throws StudentNotFoundException;

    Student enrollStudentInSubject(long studentId, long subjectId) throws StudentNotFoundException, SubjectNotFoundException;

    Student registerStudentForExam(long studentId, long examId) throws StudentNotFoundException, ExamNotFoundException, SubjectNotEnrolledException;

    List<Student> findAllStudents();

    void deleteStudent(long studentId) throws StudentNotFoundException;
}
