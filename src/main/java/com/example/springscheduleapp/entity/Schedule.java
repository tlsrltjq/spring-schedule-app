package com.example.springscheduleapp.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    private String passward;

    public  Schedule(String title, String content, String userName, String passward) {
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.passward = passward;
    }

    public void updateSchedule(String title, String content, String userName, String passward) {
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.passward = passward;
    }

}
