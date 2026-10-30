package com.sethu.todo;

import com.sethu.todo.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/get")
    String getTodo()
    {
        //todoService.printTodos();
        return "todo";
    }

    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoId(@PathVariable long id)
    {

       return new ResponseEntity<>(todoService.getTodoById(id), HttpStatus.OK);
    }
    // Request Param
    @GetMapping("/")
    String getTodoIdParam(@RequestParam("sethuId") long id)
    {
        return "Id Param" + id;
    }
    @PostMapping("/create")
    ResponseEntity<Todo> createUser (@RequestBody Todo todo)
    {
        return new ResponseEntity<>(todoService.createTodo(todo), HttpStatus.CREATED);
    }
   @PutMapping("/{id}")
   String updateUser (@PathVariable long id)
   {
       return "updated user id " + id;
   }
   @DeleteMapping("/{id}")
   String deleteUser(@PathVariable long id)
   {
       return "Deleted user Id " + id;
   }

   @GetMapping
    ResponseEntity<List<Todo>> getTodos(){
        return new ResponseEntity<List<Todo>>(todoService.getTodos(),HttpStatus.OK);
   }
}
