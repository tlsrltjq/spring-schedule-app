package com.example.springscheduleapp.controller;

import com.example.springscheduleapp.dto.CreateScheduleRequest;
import com.example.springscheduleapp.dto.CreateScheduleResponse;
import com.example.springscheduleapp.dto.GetScheduleResponse;
import com.example.springscheduleapp.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest createScheduleRequest) {
        CreateScheduleResponse result = scheduleService.save(createScheduleRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/schedules/{scheduleId}")
    public ResponseEntity<GetScheduleResponse> getOneSchedule(@PathVariable Long scheduleId) {
        GetScheduleResponse result = scheduleService.getOneSchdule(scheduleId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/schedules")
    public ResponseEntity<List<GetScheduleResponse>> getAllSchedules() {
        List<GetScheduleResponse> result = scheduleService.getAllSchedules();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
