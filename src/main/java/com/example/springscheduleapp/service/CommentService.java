package com.example.springscheduleapp.service;

import com.example.springscheduleapp.dto.CreateCommentRequest;
import com.example.springscheduleapp.dto.CreateCommentResponse;
import com.example.springscheduleapp.dto.GetScheduleResponse;
import com.example.springscheduleapp.entity.Comment;
import com.example.springscheduleapp.entity.Schedule;
import com.example.springscheduleapp.repository.CommentRepository;
import com.example.springscheduleapp.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final ScheduleRepository scheduleRepository;

    @Transactional
    public CreateCommentResponse save(Long scheduleId, CreateCommentRequest request) {
        Schedule schedule = scheduleRepository.findById(scheduleId).orElseThrow(() -> new IllegalStateException("없는 일정입니다."));
        Comment comment = new Comment(request.getComment(), request.getUserName(), request.getPassword(), schedule);
        GetScheduleResponse response = new GetScheduleResponse(schedule.getId(), schedule.getTitle(), schedule.getContent(), schedule.getUserName(), schedule.getCreatedAt(), schedule.getModifiedAt());
        Comment savedComment = commentRepository.save(comment);
        return new CreateCommentResponse(savedComment.getId(), savedComment.getComment(), savedComment.getUserName(), response, savedComment.getCreatedAt(), savedComment.getModifiedAt());
    }
}
