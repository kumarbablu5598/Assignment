package com.example.todo;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public  class Todo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	private boolean status;
	
	public Todo() {
		
	}
//	
//	public Todo(int id, String title, boolean status) {
//		this.id = id;
//		this.title = title;
//		this.status = status;
//	}



//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public boolean isStatus() {
//		return status;
//	}
//
//	public void setStatus(boolean status) {
//		this.status = status;
//	}
//
//	@Override
//	public String toString() {
//		
//		return "Todo [id=" + id + ", title=" + title + ", status=" + status + "]";
//	}
	
	

}
