package com.example.springscheduleapp.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateScheduleResponse {
    private final Long id;
    private final String name;
    private final String content;
    private final String userName;
    private final String passward;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public CreateScheduleResponse(Long id, String name, String content, String userName, String passward, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.userName = userName;
        this.passward = passward;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
