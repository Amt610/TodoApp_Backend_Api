package com.amitgroup.todo.controller;

import com.amitgroup.todo.entity.Todo;
import com.amitgroup.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService=todoService;
    }

    //get all details
    @GetMapping
    public List<Todo> getAll(){
        return todoService.getAll();
    }

    //post Mapping
    @PostMapping
    public Todo create(@RequestBody Todo todo){
        return todoService.save(todo);
    }

    //put Mapping
    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id,@RequestBody Todo updated){
        return todoService.findById(id).map(todo -> {
            todo.setTitle(updated.getTitle());
            todo.setCompleted(updated.isCompleted());
            return todoService.save(todo);
        }).orElseThrow(()->new RuntimeException("Todo not found"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        todoService.delete(id);
    }
}
