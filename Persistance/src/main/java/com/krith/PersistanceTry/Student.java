package com.krith.PersistanceTry;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int Id;
	private int Rollno;
	private String LastName;
	private String FirstName;
	private float Gpa;
	private String City;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public float getGpa() {
		return Gpa;
	}
	public void setGpa(float gpa) {
		Gpa = gpa;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Rollno=" + Rollno + ", LastName=" + LastName + ", FirstName=" + FirstName
				+ ", Gpa=" + Gpa + ", City=" + City + "]";
	}
	
}
