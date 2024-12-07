package br.com.felipemaia.todolist.Controller;

import br.com.felipemaia.todolist.Service.TodoService;
import br.com.felipemaia.todolist.entity.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoService.crete(todo);
    }

    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return  todoService.updade(todo);
    }

    @DeleteMapping("{id")
    List<Todo> delete(@PathVariable("id") Long id){
        return  todoService.delete(id);
    }

}