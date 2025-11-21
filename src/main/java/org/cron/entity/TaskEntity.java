package org.cron.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TaskEntity {
    @Id
    private Long id;
}
