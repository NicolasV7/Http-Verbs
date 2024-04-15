package com.villota.http_verbs.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.villota.http_verbs.model.Task;
import com.villota.http_verbs.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> get_all_tasks() {
        return taskRepository.findAll();
    }

    public Task post_task(Task task) {
        return taskRepository.save(task);
    }

    public void delete_task(ObjectId _id) {
        taskRepository.deleteById(_id);
    }

    public Task patch_task(ObjectId _id, Task task) {
        task.set_id(_id);
        return taskRepository.save(task);
    }
}
