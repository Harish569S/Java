package com.mindtree.customer.entity;

public class Customer {
	private int age,id;
	private String name;
	  public Customer(int id,String name,int age) {
	  this.id=id;
	  this.name=name;
	  this.age=age;
	  }
	  public void setAge(int age) {
			this.age = age;
		}
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	}
	


