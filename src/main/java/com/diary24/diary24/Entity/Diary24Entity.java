package com.diary24.diary24.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diary_24")
public class Diary24Entity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int taskId;
    private String category;
    private String task;
    private String status;
    
    public Diary24Entity() {
    }

    public Diary24Entity(int taskId, String category, String task, String status) {
        this.taskId = taskId;
        this.category = category;
        this.task = task;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Diary24Entity [taskId=" + taskId + ", category=" + category + ", task=" + task + ", status=" + status
                + "]";
    }

    
    
}
