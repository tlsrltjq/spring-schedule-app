package com.example.springscheduleapp.dto;

import com.example.springscheduleapp.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateCommentResponse {
    private final String id;
    private final String comment;
    private final String userName;
    private final Schedule schedule;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;


    public CreateCommentResponse(String id, String comment, String userName, Schedule schedule, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.comment = comment;
        this.userName = userName;
        this.schedule = schedule;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
