package com.crio.lms.exchanges;

import java.util.List;

import com.crio.lms.dto.Exam;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetAllExamsResponse {
    private List<Exam> exams;
}
