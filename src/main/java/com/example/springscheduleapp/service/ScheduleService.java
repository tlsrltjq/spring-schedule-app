package com.example.springscheduleapp.service;

import com.example.springscheduleapp.dto.CreateScheduleRequest;
import com.example.springscheduleapp.dto.CreateScheduleResponse;
import com.example.springscheduleapp.dto.GetScheduleResponse;
import com.example.springscheduleapp.entity.Schedule;
import com.example.springscheduleapp.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Transactional
    public CreateScheduleResponse save(CreateScheduleRequest request) {
        Schedule schedule = new Schedule(request.getTitle(), request.getContent(), request.getUesrName(), request.getPassward());
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return new CreateScheduleResponse(savedSchedule.getId(),savedSchedule.getTitle(), savedSchedule.getContent(), savedSchedule.getUserName(), savedSchedule.getPassward(), savedSchedule.getCreatedAt(), savedSchedule.getModifiedAt());
    }

    @Transactional(readOnly = true)
    public GetScheduleResponse getOneSchdule(Long scheduleId) {
        Schedule schedule = scheduleRepository.findById(scheduleId).orElseThrow(()->new IllegalStateException("Schedule not found!"));
        return new GetScheduleResponse(schedule.getId(),schedule.getTitle(),schedule.getContent(),schedule.getUserName(),schedule.getCreatedAt(),schedule.getModifiedAt());
    }

    @Transactional(readOnly = true)
    public List<GetScheduleResponse> getAllSchedules() {
        List<Schedule> schedules = scheduleRepository.findAll();
        List<GetScheduleResponse> result = new ArrayList<>();
        for (Schedule schedule : schedules) {
            result.add(new GetScheduleResponse(schedule.getId(),schedule.getTitle(),schedule.getContent(),schedule.getUserName(),schedule.getCreatedAt(),schedule.getModifiedAt()));
        }
        return result;
    }
}
