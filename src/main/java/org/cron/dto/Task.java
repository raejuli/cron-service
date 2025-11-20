package org.cron.dto;

import lombok.Data;

@Data
public class Task {
    private String name;
    private String description;
    private String webhookUrl;
    private String cronExpression;
    private RetryPolicy retryPolicy;
}
