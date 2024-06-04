package com.example.demo;
import java.util.List;

import jakarta.persistence.*;
@Entity
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String firstname;
private String lasttname;
private int birthdate;
@Override
public String toString() {
	return "Person [id=" + id + ", firstname=" + firstname + ", lasttname=" + lasttname + ", birthdate=" + birthdate
			+ ", bank=" + bank + "]";
}
@OneToOne(mappedBy="bank",cascade=CascadeType.ALL)
private List<Bank>bank;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLasttname() {
	return lasttname;
}
public void setLasttname(String lasttname) {
	this.lasttname = lasttname;
}
public int getBirthdate() {
	return birthdate;
}
public void setBirthdate(int birthdate) {
	this.birthdate = birthdate;
}
public List<Bank> getBank() {
	return bank;
}
public void setBank(List<Bank> bank) {
	this.bank = bank;
}
}
