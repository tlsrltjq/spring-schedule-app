package com.example.springscheduleapp.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name="comments")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private String userName;
    private String password;
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    public Comment(String comment, String userName, String password, Schedule schedule) {
        this.comment = comment;
        this.userName = userName;
        this.password = password;
        this.schedule = schedule;
    }

    public void updateComment(String comment, String userName) {
        this.comment = comment;
        this.userName = userName;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
