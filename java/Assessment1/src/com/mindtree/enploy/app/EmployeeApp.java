package com.mindtree.enploy.app;

public class EmployeeApp implements Comparable<EmployeeApp>{
	private int id,age,salary;
	 private String name;
//	 public EmployeeApp(int id,int age,int salary,String name)
//	 {
//		 this.id=id;
//		 this.age=age;
//		 this.name=name;
//		 this.salary=salary;
//	 }
 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(EmployeeApp o) {
		// TODO Auto-generated method stub
		
		int i=(o.name).compareTo(name);
		return i;
	}


}
