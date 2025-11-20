package org.cron.dto;

import lombok.Data;

@Data
public class RetryPolicy {
    private int count;
    private long delaySeconds;
}
