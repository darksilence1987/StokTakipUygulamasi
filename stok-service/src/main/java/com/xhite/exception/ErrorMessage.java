package com.xhite.exception;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Component
public class ErrorMessage {
    private int code;
    private String message;
    private List<String> fields;
}