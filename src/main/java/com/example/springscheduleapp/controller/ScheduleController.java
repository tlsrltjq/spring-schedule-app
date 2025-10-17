package com.example.springscheduleapp.controller;

import com.example.springscheduleapp.dto.CreateScheduleRequest;
import com.example.springscheduleapp.dto.CreateScheduleResponse;
import com.example.springscheduleapp.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest createScheduleRequest) {
        CreateScheduleResponse result = scheduleService.save(createScheduleRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
