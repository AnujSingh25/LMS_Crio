package com.crio.lms.exchanges;

import java.util.List;

import com.crio.lms.dto.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetAllStudentsResponse {
    private List<Student> students;
}
