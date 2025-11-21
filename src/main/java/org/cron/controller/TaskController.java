package org.cron.controller;

import lombok.RequiredArgsConstructor;
import org.cron.dto.RetryPolicy;
import org.cron.dto.Task;
import org.cron.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
public class TaskController {
    private TaskService service;

    @PostMapping
    public void registerTask(@RequestBody Task task) {

    }

    @GetMapping
    public Task[] getAllTasks() {
        return new Task[]{};
    }

    @GetMapping("{id}")
    public Task getTaskById(@PathVariable String id) {
        return new Task();
    }

    @PutMapping("{id}")
    public void updateTaskById(@PathVariable String id) {

    }
}
