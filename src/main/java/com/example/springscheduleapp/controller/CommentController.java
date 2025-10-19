package com.example.springscheduleapp.controller;

import com.example.springscheduleapp.dto.CreateCommentRequest;
import com.example.springscheduleapp.dto.CreateCommentResponse;
import com.example.springscheduleapp.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/schedules/{scheduleId}/comments")
    public ResponseEntity<CreateCommentResponse> createComment(@PathVariable Long scheduleId, @RequestBody CreateCommentRequest createCommentRequest) {
        CreateCommentResponse result = commentService.save(scheduleId, createCommentRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
