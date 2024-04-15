package com.villota.http_verbs.repository;

import java.util.List;

import org.bson.types.ObjectId;

import com.villota.http_verbs.model.Task;

public class TaskRepository extends MongoRepository<Task, ObjectId>{

  public List<Task> findAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }

  
}
