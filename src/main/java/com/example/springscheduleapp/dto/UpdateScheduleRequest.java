package com.example.springscheduleapp.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateScheduleRequest {
    private String title;
    private String uesrName;
    private String passward;
    private LocalDateTime modifiedAt;
}
