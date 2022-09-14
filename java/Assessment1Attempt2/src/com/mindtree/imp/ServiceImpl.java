package com.mindtree.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import com.mindtree.costumer.inter.CustomerService;
import com.mindtree.customer.comp.ClassForComparator;
import com.mindtree.customer.entity.Customer;

public class ServiceImpl implements CustomerService{


	public void toPrint(ArrayList<Customer> cus) {
		//Using Iterators
		System.out.println("===========================Start==================================");
		Iterator<Customer> it=cus.iterator();
		while(it.hasNext()) {
			Customer cc=it.next();
			System.out.println("Customer_Id:"+cc.getId()+" Customer_Name:"+cc.getName()+" Customer_Age:"+cc.getAge());
			
		}
		System.out.println("===========================End====================================");
	}

	public void cusInDesc(ArrayList<Customer> cus) {
		ArrayList<Customer> dup=new ArrayList<>(cus);
		Comparator com=new ClassForComparator();
		Collections.sort(dup,com);
//		Displaying using advance for loop
		System.out.println("===========================Start==================================");
		for(Customer c:dup)
		{
			System.out.println("Customer_Id:"+c.getId()+" Customer_Name:"+c.getName()+" Customer_Age:"+c.getAge());
		}
		System.out.println("===========================End====================================");
		
		
	}

	
	public void Update(ArrayList<Customer> cus, int newId) {
	int count=0;
	Scanner sc1=new Scanner(System.in);
	for(Customer c:cus)
	{      
		if(c.getId()==newId) {
			count=1;
			System.out.print("Enter the age to be update:");
			int newAge=sc1.nextInt();
			c.setAge(newAge);
			System.out.println("Updated Details");
			System.out.println("===========================Start==================================");
			System.out.println("Customer_Id:"+c.getId()+" Customer_Name:"+c.getName()+" Customer_Age:"+c.getAge());
			System.out.println("===========================End====================================");
			break;
			
		}
	}
	if(count==0)
	{
		System.out.println("Id not found");
		System.out.println();
	}		
	}

}
