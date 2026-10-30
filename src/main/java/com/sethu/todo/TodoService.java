package com.sethu.todo;

import com.sethu.todo.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TodoService {
    @Autowired
    private TodoRepository todoRepository;
    /*public TodoService(){
        todoRepository = new TodoRepository();
    }*/
//    public void printTodos(){
//        System.out.println(todoRepository.getAllTodos());
//    }

    public Todo createTodo(Todo todo)
    {
        return todoRepository.save(todo);
    }
    public Todo getTodoById(Long id){
        return todoRepository.findById(id).orElseThrow(() ->new RuntimeException("Todo not found"));
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }
}
