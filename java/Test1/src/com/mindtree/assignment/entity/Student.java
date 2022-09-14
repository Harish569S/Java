package com.mindtree.assignment.entity;

public class Student implements Comparable {
	private int marks,id;
	String name;
	public Student(int marks,int id,String name){}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
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

	@Override
	public int compareTo(Object o) {
	   Student ref=(Student)o;
	 int r=(this.name).compareTo(ref.name);
	
		return r;
	}

}
