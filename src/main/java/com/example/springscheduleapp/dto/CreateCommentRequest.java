package com.example.springscheduleapp.dto;

import com.example.springscheduleapp.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateCommentRequest {
    private String comment;
    private String userName;
    private String password;
}
