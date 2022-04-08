package com.example.todolistproject.controller;

import com.example.todolistproject.service.TodoService;
import com.example.todolistproject.test.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("todolist")
    public String todo(Model model, @PageableDefault(sort="id", direction = Sort.Direction.DESC) Pageable pageable, Todo todo) {
        model.addAttribute("todolist", todoService.showList(pageable));
        return "todo";
    }
}
