package com.taskmanager.dao;

import java.util.List;
import com.taskmanager.model.Task;

public interface TaskDao {
    void create(Task task);
    List<Task> getTasksForUser(String username);
    void markTaskAsCompleted(int taskId);
}