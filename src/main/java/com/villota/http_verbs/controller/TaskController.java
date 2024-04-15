package com.villota.http_verbs.controller;

import java.util.List;

import org.bson.types.ObjectId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.villota.http_verbs.model.Task;
import com.villota.http_verbs.service.TaskService;

@RestController
@RequestMapping("/v1/api/task")
public class TaskController {
  @Autowired
  private TaskService taskService;
  
  @GetMapping("/getAll")
  public ResponseEntity<List<Task>> get_all_tasks() {
    List<Task> tasks = taskService.get_all_tasks();
    return new ResponseEntity<>(tasks, HttpStatus.OK);
  }

  @PostMapping("/create")
  public ResponseEntity<Task> post_task(@RequestBody Task task) {
    Task createdTask = taskService.post_task(task);
    return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
  }

  @DeleteMapping("/delete/{_id}")
  public ResponseEntity<Void> delete_task(@PathVariable("_id") ObjectId _id) {
    taskService.delete_task(_id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @PatchMapping("/update/{_id}")
  public ResponseEntity<Task> patch_task(@PathVariable("_id") ObjectId _id, @RequestBody Task task) {
    Task updatedTask = taskService.patch_task(_id, task);
    return new ResponseEntity<>(updatedTask, HttpStatus.OK);
  }
}