package com.amitgroup.todo.service;


import com.amitgroup.todo.entity.Todo;
import com.amitgroup.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository repo;

    public TodoService(TodoRepository repo) {
        this.repo = repo;
    }

    public List<Todo> getAll() { return repo.findAll(); }

    public Todo save(Todo todo) { return repo.save(todo); }

    public Optional<Todo> findById(Long id) { return repo.findById(id); }

    public void delete(Long id) { repo.deleteById(id); }
}
