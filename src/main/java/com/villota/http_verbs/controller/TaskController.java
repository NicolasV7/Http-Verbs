package com.villota.http_verbs.controller;

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
@RequestMapping("/tasks")
public class TaskController {
  @Autowired
  private TaskService taskService;
  
  @GetMapping("/getAll")
  public String get_all_tasks() {
    return taskService.get_all_tasks();
  }

  @PostMapping("/add")
  public String post_task(@RequestBody Task task) {
    return taskService.post_task(task);
  }

  @DeleteMapping("/delete/{_id}")
  public String delete_task(@PathVariable("_id") ObjectId _id) {
    return taskService.delete_task(_id);
  }

  @PatchMapping("/update/{_id}")
  public String patch_task(@PathVariable("_id") ObjectId _id, @RequestBody Task task) {
    return taskService.patch_task(_id, task);
  }

  @RequestMapping(value = "/getAll", method = RequestMethod.HEAD)
  public ResponseEntity<String> handle_head_tasks() {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      headers.add("Hola", "Chao");
      return new ResponseEntity<>(headers, HttpStatus.OK);
  }

  @RequestMapping(value = "/update", method = RequestMethod.OPTIONS)
  public String handle_options_tasks() {
    return taskService.options_task();
  }

}
