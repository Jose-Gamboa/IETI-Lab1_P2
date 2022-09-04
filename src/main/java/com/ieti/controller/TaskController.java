package com.ieti.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ieti.dto.TaskDto;
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
        return null;
    }

    @RequestMapping( value = "/findById/{id}", method = RequestMethod.GET )
    public ResponseEntity<TaskDto> findById( @PathVariable String id ){
        return null;
    }

    @RequestMapping( value = "/create/", method = RequestMethod.POST )
    public ResponseEntity<TaskDto> create( @RequestBody TaskDto task ){
        return null;
    }

    @RequestMapping( value = "/update/{id}", method = RequestMethod.PUT )
    public ResponseEntity<TaskDto> update( @RequestBody TaskDto task, @PathVariable String id ){
        return null;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.DELETE )
    public ResponseEntity<String> delete( @PathVariable String id ){
        return null;
    }

}
