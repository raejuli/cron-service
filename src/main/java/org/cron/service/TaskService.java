package org.cron.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.cron.converter.TaskConverter;
import org.cron.dto.Task;
import org.cron.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private TaskRepository repository;

    public List<Task> findAllTasks() {
        return this.repository.findAll().stream().map(TaskConverter::toDto).toList();
    }

    public Task findTaskById(long id) {
        return TaskConverter.toDto(this.repository.findById(id).orElseThrow(() -> new EntityNotFoundException("bad")));
    }
}
