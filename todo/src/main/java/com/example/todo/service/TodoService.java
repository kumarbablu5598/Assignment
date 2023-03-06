package com.example.todo.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.Todo;
import com.example.todo.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {
	
	
	@Autowired
	TodoRepository todoRepo;
	
	
	 

	    public List<Todo> findAll() { // Business Logic
	        return todoRepo.findAll();
	    }

	    public Todo findById(int id) {
	     return todoRepo.findById(id).get();
	    }

		public void addTodo(Todo todo) {
		   todoRepo.save(todo);
		}

		public void deleteById(int id) {
			todoRepo.deleteById(id);
			
		}

		public void updateById(int id, Todo newTodo) {
			 Todo t=todoRepo.findById(id).get();
			 
			 t.setTitle(newTodo.getTitle());
			 t.setStatus(false);
			 
			 todoRepo.save(t);
			 
		}
}
