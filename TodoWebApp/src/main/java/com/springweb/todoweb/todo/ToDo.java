package com.springweb.todoweb.todo;

import java.time.LocalDate;

public class ToDo {

	public ToDo(String name, int id, String description, LocalDate targetDate, boolean done) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	private String name;
	private int id;

	private String description;
	private LocalDate targetDate;
	private boolean done;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "ToDo [name=" + name + ", id=" + id + ", description=" + description + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}

}
