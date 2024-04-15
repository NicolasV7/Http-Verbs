package com.villota.http_verbs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.bson.types.ObjectId;

import com.villota.http_verbs.model.Task;

public interface TaskRepository extends MongoRepository<Task, ObjectId>{
  
}
