package com.example.springscheduleapp.dto;

import com.example.springscheduleapp.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CreateCommentResponse {
    private final Long id;
    private final String comment;
    private final String userName;
    private final GetScheduleResponse schedule; //컨트롤러는 Schedule 객체에 바로 접근 불가능
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;


    public CreateCommentResponse(Long id, String comment, String userName, GetScheduleResponse schedule, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.comment = comment;
        this.userName = userName;
        this.schedule = schedule;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
