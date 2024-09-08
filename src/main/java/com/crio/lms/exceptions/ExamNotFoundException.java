package com.crio.lms.exceptions;

import java.io.IOException;

public class ExamNotFoundException extends IOException {

    public ExamNotFoundException() {

    }

    public ExamNotFoundException(String message) {
        super(message);
    }
}
