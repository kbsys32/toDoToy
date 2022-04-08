package com.example.todolistproject.service;

import com.example.todolistproject.repository.TodoRepository;
import com.example.todolistproject.test.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Transactional
//    DB 일괄처리를 위한 트랜잭션 어노테이션 >> 속성 및 동작원리 , 처리방법 공부 필요
    public void addList(Todo todo) {
        todoRepository.save(todo);
    }

    @Transactional
    public Page<Todo> showList(Pageable pageable){
        return todoRepository.findAll(pageable);
    }

    @Transactional
    public void deleteList(int id) {
        todoRepository.deleteById(id);
    }
}