package com.villota.http_verbs.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.villota.http_verbs.model.Task;

@Service
public class TaskService {

  private List<Task> tasks;

  boolean started = false;

  ObjectId _id = new ObjectId();
  String title = "Task 1";
  String description = "Description 1";
  boolean done = false;

  public void set_tasks(){
    if (this.started==false) {
      this.tasks = new ArrayList<Task>();
      tasks.add(new Task(_id, title, description, done));
      this.started = true;
      
    }
  }

  public String get_all_tasks() {
    set_tasks();
    return "----->\n" + tasks.toString() + "\n<-----";
  }

  public String post_task(Task task) {
    set_tasks();
    tasks.add(task);
    return "----->\n" + tasks.toString() + "\n<-----";
  }

  public String update_task(Task task) {
    set_tasks();
    for (Task t : tasks) {
      if (t.get_id().equals(task.get_id())) {
        t.set_title(task.get_title());
        t.set_description(task.get_description());
        t.set_done(task.is_done());
        return "----->\n" + tasks.toString() + "\n<-----";
      }
    }
    return "----->\n" + "Task not found" + "\n<-----";
  }

  public String get_task(ObjectId _id) {
    set_tasks();
    for (Task t : tasks) {
      if (t.get_id().equals(_id)) {
        return "----->\n" + t.toString() + "\n<-----";
      }
    }
    return "----->\n" + "Task not found" + "\n<-----";
  }

  public String delete_task(ObjectId _id) {
    set_tasks();
    for (Task t : tasks) {
      if (t.get_id().equals(_id)) {
        tasks.remove(t);
        return "----->\n" + tasks.toString() + "\n<-----";
      }
    }
    return "----->\n" + "Task not found" + "\n<-----";
  }

  public String options_task() {
    return "----->\n" + "OPTIONS" + "\n<-----";
  }

  public String patch_task(ObjectId _id, Task task) {
    set_tasks();
    for (Task t : tasks) {
      if (t.get_id().equals(_id)) {
        t.set_title(task.get_title());
        t.set_description(task.get_description());
        t.set_done(task.is_done());
        return "----->\n" + tasks.toString() + "\n<-----";
      }
    }
    return "----->\n" + "Task not found" + "\n<-----";
  }
}
