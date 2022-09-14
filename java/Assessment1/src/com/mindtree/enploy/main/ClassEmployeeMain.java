package com.mindtree.enploy.main;
import java.util.*;

import com.mindtree.emp.service.EmployeeService;
import com.mindtree.empl.ser.imp.EmployeeServiceImp;
import com.mindtree.enploy.app.EmployeeApp;
public class ClassEmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<EmployeeApp> arList=new ArrayList<>();
		EmployeeApp emp;
		
		int N=1;
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter the details of Empid:"+(i+1));
			int id=i+1;
			System.out.print("Enter Name of employee:");
			String name=sc.next();
			System.out.print("Enter the salary of employee:");
			int salary= sc.nextInt();
			System.out.print("Enter the age of employee:");
			
			int age=sc.nextInt();
			System.out.println();
			emp=new EmployeeApp();
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			emp.setAge(age);
		//	emp=new EmployeeApp(id,age,salary,name);
			arList.add(emp);
		} 
		int flag=5;
		while(flag==5) {
		System.out.println("Enter 1:To display all employee details"
				+ "\nEnter 2:To display all employee details in decreasing order of there name"
				+ "\nEnter 3:To update salary of an employee providing id and updated salary "
				+ "\nEnter 4:To exit");
		System.out.println();
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:EmployeeService it=new EmployeeServiceImp();
		          it.toPrint(arList);
		          break;
		case 2:EmployeeService it1=new EmployeeServiceImp();
		         it1.toPrintInDesc(arList);
		         break;
		case 3:System.out.println("Enter the id of employee");
		         int id=sc.nextInt();
		         System.out.println("Enter the salary to update");
		         int sal=sc.nextInt();
			     EmployeeService it2=new EmployeeServiceImp();
			     it2.toUpdateSalary(arList, id, sal);
			     break;
		case 4:System.exit(0);
	             
		}
		System.out.println("Enter 5 to continue");
		flag=sc.nextInt();
		}//end of while
		sc.close();
		
	}

}
