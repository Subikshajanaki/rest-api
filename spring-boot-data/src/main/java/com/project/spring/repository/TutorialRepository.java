package com.project.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.spring.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}