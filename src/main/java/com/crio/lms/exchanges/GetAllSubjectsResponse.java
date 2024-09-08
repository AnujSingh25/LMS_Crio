package com.crio.lms.exchanges;

import java.util.List;

import com.crio.lms.dto.Subject;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetAllSubjectsResponse {
    private List<Subject> subjects;
}
