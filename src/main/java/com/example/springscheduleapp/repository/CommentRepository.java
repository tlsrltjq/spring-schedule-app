package com.example.springscheduleapp.repository;

import com.example.springscheduleapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
