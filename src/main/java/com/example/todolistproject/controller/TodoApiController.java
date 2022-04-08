package com.example.todolistproject.controller;

import com.example.todolistproject.domain.ResponseDto;
import com.example.todolistproject.service.TodoService;
import com.example.todolistproject.test.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoApiController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/api/todo")
    public ResponseDto<Integer> save(@RequestBody Todo todo) {
        todoService.addList(todo);
        return new ResponseDto<>(HttpStatus.OK.value(), 1);
    }

    @DeleteMapping("/api/todo/{id}")
    public ResponseDto<Integer> deleteById(@PathVariable int id){
        todoService.deleteList(id);
        return new ResponseDto<>(HttpStatus.OK.value(), 1);
    }

}