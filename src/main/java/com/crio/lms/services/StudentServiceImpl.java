package com.crio.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.lms.dto.Student;
import com.crio.lms.exceptions.ExamNotFoundException;
import com.crio.lms.exceptions.StudentNotFoundException;
import com.crio.lms.exceptions.SubjectNotEnrolledException;
import com.crio.lms.exceptions.SubjectNotFoundException;
import com.crio.lms.exchanges.RegisterStudentRequest;
import com.crio.lms.repositoryServices.StudentRepositoryService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepositoryService studentRepositoryService;

    @Override
    public Student registerStudent(RegisterStudentRequest registerStudentRequest) {
        String studentName = registerStudentRequest.getStudentName();
        Student student = studentRepositoryService.createStudent(studentName);
        return student;
    }

    @Override
    public Student findStudentById(long studentId) throws StudentNotFoundException {
        Student student = studentRepositoryService.findStudentById(studentId);
        return student;
    }

    @Override
    public Student enrollStudentInSubject(long studentId, long subjectId) throws StudentNotFoundException, SubjectNotFoundException {
        Student student = studentRepositoryService.enrollStudentInSubject(studentId, subjectId);
        return student;
    }

    @Override
    public Student registerStudentForExam(long studentId, long examId) throws StudentNotFoundException, ExamNotFoundException, SubjectNotEnrolledException {
        Student student = studentRepositoryService.registerStudentForExam(studentId, examId);
        return student;
    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> students = studentRepositoryService.findAllStudents();
        return students;
    }

    @Override
    public void deregisterStudent(long studentId) throws StudentNotFoundException {
        studentRepositoryService.deleteStudent(studentId);
    }
    
}
