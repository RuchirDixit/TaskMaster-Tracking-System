package com.airtribe.taskcollaborationsystem.service;

import com.airtribe.taskcollaborationsystem.dto.TaskDTO;
import com.airtribe.taskcollaborationsystem.entity.Task;
import com.airtribe.taskcollaborationsystem.repository.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(@Valid Task task) {

        return taskRepository.save(task);
    }

//    private Task toEntity(TaskDTO taskDTO){
//        Task task = new Task();
//        task.se
//    }
}
