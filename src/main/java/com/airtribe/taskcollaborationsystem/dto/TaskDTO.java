package com.airtribe.taskcollaborationsystem.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {
    private String title;

    private String description;

    private Date dueDate;
}
