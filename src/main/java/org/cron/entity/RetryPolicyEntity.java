package org.cron.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

@Embeddable
@Data
public class RetryPolicyEntity {
    private int count;
    private long delaySeconds;
}
