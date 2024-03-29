package com.example.todo.todoassignment.controller;

import com.example.todo.todoassignment.dto.TaskDto;
import com.example.todo.todoassignment.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/tasks")
@Data
@AllArgsConstructor
@CrossOrigin("*")
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<TaskDto> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping
    public TaskDto addTask(@Valid @RequestBody TaskDto task) {
        return taskService.addTask(task);
    }

    @PutMapping
    public TaskDto updateTask(@Valid @RequestBody TaskDto task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping
    public TaskDto deleteTask(@Valid @RequestBody TaskDto task) {
        return taskService.deleteTask(task);
    }

}
