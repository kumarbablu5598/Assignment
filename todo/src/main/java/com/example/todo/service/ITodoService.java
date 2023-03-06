package com.example.todo.service;


import java.util.List;
import java.util.Optional;

import com.example.todo.Todo;

public interface ITodoService {

	public List<Todo> findAll();// Business Logic

	public Todo findById(int id);

	public void addTodo(Todo todo);

	public void deleteById(int id);

	public void updateById(int id, Todo newTodo);

}
