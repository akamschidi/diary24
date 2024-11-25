package com.diary24.diary24.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.diary24.diary24.Entity.Diary24Entity;
import com.diary24.diary24.Repository.Diary24Repository;






@RestController
public class Diary24Controller {
    
    @Autowired
    Diary24Repository diary24Repository;

    //add task...
    
    @PostMapping("diary24/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addTask(@RequestBody Diary24Entity diary24Entity) {
        diary24Repository.save(diary24Entity);
    }
         

    //display all tasks

 @GetMapping("/alltasks")
    public List<Diary24Entity> getAllTasks(){
     List<Diary24Entity> getTasks = diary24Repository.findAll();
     return getTasks;
 }

 //display a specific task by id

 
 @GetMapping("task/{id}")
 public Diary24Entity getTaskID(@PathVariable int Id) {
     Diary24Entity findTask = diary24Repository.findById(Id).get();
     return findTask;
 }
 
 // update task 
 @PutMapping("task/update/{id}")
 public Diary24Entity updateStatus(@PathVariable int id) {
     Diary24Entity updateTask = diary24Repository.findById(id).get();
     updateTask.setStatus("Done");
     updateTask.setTask("wash your car");
     diary24Repository.save(updateTask);
     return updateTask;
     
 }

 //delete task
 @DeleteMapping("task/delete/{id}")
 public void removeTask(@PathVariable int id){
    Diary24Entity removeTask = diary24Repository.findById(id).get();
    diary24Repository.delete(removeTask); 
    
 }
 
    
    
}
