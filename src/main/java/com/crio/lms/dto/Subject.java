package com.crio.lms.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"registeredStudents"})
public class Subject {
   
    private long id;  

    private String name;

    @JsonIgnore
    private Set<Student> registeredStudents;
}
