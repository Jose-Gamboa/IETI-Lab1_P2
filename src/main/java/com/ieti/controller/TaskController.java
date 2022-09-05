package com.ieti.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ieti.dto.TaskDto;
import com.ieti.entities.Task;
import com.ieti.service.TaskService;

@RestController
@RequestMapping( "/tasks" )
public class TaskController {

    private final TaskService taskService;
    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public TaskController( TaskService taskService ){
        this.taskService = taskService;
    }

    @RequestMapping( value = "/getAll", method = RequestMethod.GET )
    public ResponseEntity<List<TaskDto>> getAll(){
        List<Task> temp = taskService.getAll();
        List<TaskDto> converse = new ArrayList<TaskDto>();
        for(Task task:temp){
            converse.add(modelMapper.map(task, TaskDto.class));
        }
        return new ResponseEntity<>(converse, HttpStatus.OK);
    }

    @RequestMapping( value = "/findById/{id}", method = RequestMethod.GET )
    public ResponseEntity<TaskDto> findById( @PathVariable String id ){
        TaskDto tDto = modelMapper.map(taskService.findById(id), TaskDto.class);
        return new ResponseEntity<>(tDto, HttpStatus.OK);
    }

    @RequestMapping( value = "/create", method = RequestMethod.POST )
    public ResponseEntity<TaskDto> create( @RequestBody TaskDto task ){
        taskService.create(modelMapper.map(task, Task.class));
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @RequestMapping( value = "/update/{id}", method = RequestMethod.PUT )
    public ResponseEntity<TaskDto> update( @RequestBody TaskDto task, @PathVariable String id ){
        if(taskService.update(modelMapper.map(task, Task.class), id) == null){ return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
        taskService.update(modelMapper.map(task, Task.class), id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.DELETE )
    public ResponseEntity<String> delete( @PathVariable String id ){
        boolean flag = taskService.deleteById(id);
        if(!flag){return new ResponseEntity<>("Unsuccessful elimination", HttpStatus.NOT_FOUND);}
        return new ResponseEntity<>("Successful elimination", HttpStatus.OK);
    }

}
