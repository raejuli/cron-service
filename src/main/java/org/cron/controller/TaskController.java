package org.cron.controller;

import org.cron.dto.RetryPolicy;
import org.cron.dto.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @GetMapping
    public RetryPolicy hello(@RequestBody Task task) {
        RetryPolicy policy = task.getRetryPolicy();
        return policy;
    }
}
