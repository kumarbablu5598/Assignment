package com.example.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.todo.service.TodoService;




@RestController
@RequestMapping("/api/todo-app")
public class controller {
	
	@Autowired
	 public  TodoService todoService;

	    @PostMapping("/add-todo")
	    public void addTodo(@RequestBody Todo todo) {
	        todoService.addTodo(todo);
	    }

	    @GetMapping("/find/{id}")
	    public Todo findTodoById(@PathVariable int id) {
	        return todoService.findById(id);
	    }

	    //http://localhost:8080/api/v1/todo-app/find-all
	    @GetMapping("/find-all")
	    public List<Todo> findAllTodos() { // controller is talking to the service layer
	        return todoService.findAll();
	    }

	    //@RequestMapping(value="url",method=HttpRequest.PUT)
	    @PutMapping("update-todo")
	    public void updateTodo(@PathVariable int id, @RequestBody Todo todo) {
	    	 todoService.updateById(id,todo);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteTodo(@PathVariable int id) {
		todoService.deleteById(id);
	}
}
