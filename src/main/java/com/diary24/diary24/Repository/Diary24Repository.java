package com.diary24.diary24.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diary24.diary24.Entity.Diary24Entity;
@Repository

public interface Diary24Repository extends JpaRepository<Diary24Entity, Integer> {
    
  
}
