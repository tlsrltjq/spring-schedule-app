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
    @Column(length = 100, nullable = false)
    private String comment;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
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

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
