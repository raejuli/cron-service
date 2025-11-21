package org.cron.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TaskEntity {
    @Id
    private Long id;

    private String name;
    private String description;
    private String webhookUrl;
    private String cronExpression;
    private boolean isActive;
    private RetryPolicyEntity retryPolicy;
}
