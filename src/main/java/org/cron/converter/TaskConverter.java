package org.cron.converter;

import org.cron.dto.Task;
import org.cron.entity.TaskEntity;

public final class TaskConverter {
    public static Task toDto(TaskEntity entity) {
        return new Task();
    }

    public static TaskEntity toEntity(Task dto) {
        return new TaskEntity();
    }
}
