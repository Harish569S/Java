package com.mindtree.costumer.main;
import java.util.*;

import com.mindtree.costumer.inter.CustomerService;
import com.mindtree.customer.entity.Customer;
import com.mindtree.imp.ServiceImpl;
public class CustomerMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Customer> cus=new ArrayList<>();
	System.out.print("Enter number of customers:");
	int N=sc.nextInt();
	System.out.println();
	for(int i=1;i<=N;i++)
	{    
		System.out.println("Customer Id:"+i);
		System.out.print("Enter the name of customer:");
		String name=sc.next();
		System.out.print("Enter the age of the customer:");
		int age=sc.nextInt();
		System.out.println();
		Customer c=new Customer(i,name,age);
		cus.add(c);
	}
	while(true)
	{  	System.out.println();
		System.out.println("Enter 1:To display all the costomer details"
			+ "\nEnter 2:To display all the details of customers in descending order of there name"
			+ "\nEnter 3:To update the age of the customer by proving the id and age to update"
			+ "\nEnter 4:To exit of the program");
		int choice=sc.nextInt();
		System.out.println("Entered choice is:"+choice);
		System.out.println();
		switch(choice) {
		case 1:CustomerService call=new ServiceImpl();
			    call.toPrint(cus);
			    break;
		case 2:CustomerService call_1=new ServiceImpl();
		        call_1.cusInDesc(cus);
		        
			break;
		case 3:System.out.print("Enter Customer_Id:");
		int id=sc.nextInt();
		
		CustomerService call_2=new ServiceImpl();
        call_2.Update(cus,id);
		  
			break;
		case 4:System.out.println("===============================Exit==============================");
			System.exit(0);
		
		}
	}
	
	

	}

}
