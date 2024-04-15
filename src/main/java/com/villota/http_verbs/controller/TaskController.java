package com.villota.http_verbs.controller;

import java.util.List;

import org.bson.types.ObjectId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.villota.http_verbs.model.Task;
import com.villota.http_verbs.service.TaskService;

@RestController
@RequestMapping("/v1/api/task")
public class TaskController {
  @Autowired
  private TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }
  
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
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PatchMapping("/update/{_id}")
  public ResponseEntity<Task> patch_task(@PathVariable("_id") ObjectId _id, @RequestBody Task task) {
    Task updatedTask = taskService.patch_task(_id, task);
    return new ResponseEntity<>(updatedTask, HttpStatus.OK);
  }

  @RequestMapping(value = "/getHead", method = RequestMethod.HEAD)
  public ResponseEntity<String> handle_head_tasks() {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      headers.add("Holi :3", "Ciao :c");
      return new ResponseEntity<>(headers, HttpStatus.OK);
  }

  @RequestMapping(value = "/getOptions", method = RequestMethod.OPTIONS)
  public String handle_options_tasks() {
      return taskService.options_task();
  }
}