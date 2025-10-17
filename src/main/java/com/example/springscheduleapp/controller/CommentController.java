package com.example.springscheduleapp.controller;

import com.example.springscheduleapp.repository.CommentRepository;
import com.example.springscheduleapp.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;
}
