package com.example.springscheduleapp.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateScheduleRequest {
    private String title;
    private String content;
    private String uesrName;
    private String passward;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
