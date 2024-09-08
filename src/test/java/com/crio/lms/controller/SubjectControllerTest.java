package com.crio.lms.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.crio.lms.dto.Subject;
import com.crio.lms.services.SubjectService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = SubjectController.class)
public class SubjectControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SubjectService subjectService;

    @Test
    public void testGetSubjectById() throws Exception {
        Subject subject = new Subject();
        subject.setId(1);
        subject.setName("JAVA");

        when(subjectService.findSubjectById(1)).thenReturn(subject);

        mockMvc.perform(get("/subjects/{subjectId}", 1))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id").value(1))
            .andExpect(jsonPath("$.name").value("JAVA"));
    }
}
