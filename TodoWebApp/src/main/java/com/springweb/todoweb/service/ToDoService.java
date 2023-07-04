package com.springweb.todoweb.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.springweb.todoweb.todo.ToDo;

@Service
public class ToDoService {

	public static List<ToDo> todos = new ArrayList<>();
	public static int todocount = 0;
	private boolean removeIf;
	static {
		todos.add(new ToDo("Saurabh", ++todocount, "AWS", LocalDate.now(), true));
		todos.add(new ToDo("Saurabh", ++todocount, "JAVA", LocalDate.now(), false));
		todos.add(new ToDo("Ankit", ++todocount, "OS", LocalDate.now(), true));
		todos.add(new ToDo("Ankit", ++todocount, "AIML", LocalDate.now(), true));
	}

	public List<ToDo> retrievetodo(String user) {
		Predicate<? super ToDo> predicate = todo -> todo.getName().equalsIgnoreCase(user);
		return todos.stream().filter(predicate).toList();
	}

	public void addToDo(String username, String description, LocalDate targetDate, boolean done) {
		ToDo toDo = new ToDo(username, ++todocount, description, targetDate, false);
		todos.add(toDo);
	}

	public void deleteById(int id) {
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public ToDo findById(int id) {
		Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
		ToDo toDo = todos.stream().filter(predicate).findFirst().get();
		return toDo;
	}

	public void updateTodo(ToDo todo) {
		deleteById(todo.getId());
		todos.add(todo);

	}
}
