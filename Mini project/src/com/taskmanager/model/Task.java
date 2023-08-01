package com.taskmanager.model;

public class Task {
    private int id;
    private String taskName;
    private String username;
    private String dueDate;
    private boolean isCompleted;

    public Task() {}

    public Task(String taskName, String username, String dueDate, boolean isCompleted) {
        this.taskName = taskName;
        this.username = username;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }

    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
    public String toString() {
        return "Task [id=" + id + ", taskName=" + taskName + ", username=" + username
                + ", dueDate=" + dueDate + ", isCompleted=" + isCompleted + "]";
    }
}