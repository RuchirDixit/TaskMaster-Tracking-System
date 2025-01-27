package com.airtribe.taskcollaborationsystem.controller;

import com.airtribe.taskcollaborationsystem.dto.TaskDTO;
import com.airtribe.taskcollaborationsystem.entity.Task;
import com.airtribe.taskcollaborationsystem.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/task")
    public ResponseEntity<Task> saveProject(@Valid @RequestBody Task task) {
        Task response = taskService.saveTask(task);
        return ResponseEntity.ok(response);
    }
}
