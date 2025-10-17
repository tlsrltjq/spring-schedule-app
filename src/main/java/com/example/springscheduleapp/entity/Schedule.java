package com.example.springscheduleapp.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name="schedules")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String title;
    private String content;
    private String userName;
    @Column(length = 20, nullable = false)
    private String password;
    @OneToMany(mappedBy = "schedule")
    private List<Comment> comments= new ArrayList<>(); //null pointer exception 방지

    public Schedule(String title, String content, String userName, String password) {
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.password = password;
    }

    public void updateSchedule(String title, String userName) {
        this.title = title;
        this.userName = userName;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
        comment.setSchedule(this);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
        comment.setSchedule(null);
    }

}
