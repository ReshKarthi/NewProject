package com.example.demo;
import jakarta.persistence.*;
@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}
	String name;
	int phoneno;
	private
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

}
