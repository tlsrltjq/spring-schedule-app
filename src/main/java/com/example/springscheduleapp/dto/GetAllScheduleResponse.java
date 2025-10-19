package com.example.springscheduleapp.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetAllScheduleResponse {
    private final Long id;
    private final String title;
    private final String content;
    private final String userName;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public GetAllScheduleResponse(Long id, String title, String content, String userName, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
