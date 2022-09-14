package com.mindtree.empl.ser.imp;

import java.util.ArrayList;
import java.util.Collections;

import com.mindtree.emp.service.EmployeeService;
import com.mindtree.enploy.app.EmployeeApp;

public class EmployeeServiceImp implements EmployeeService {
	public void toPrint(ArrayList<EmployeeApp> al) {
		for(EmployeeApp e:al)
		{
			System.out.println("Id:"+e.getId()+" Name:"+e.getName()+" Salary:"+e.getSalary()+" Age:"+e.getAge());
		}
		System.out.println("=============================================================");
		System.out.println();
		
	}
	public void toPrintInDesc(ArrayList<EmployeeApp> al) {
		ArrayList<EmployeeApp> copy=new ArrayList<>(al);
//		  Comparable cs=new EmployeeApp();
		  Collections.sort(copy);
		for(EmployeeApp e:copy)
		{
			System.out.println("Id:"+e.getId()+" Name:"+e.getName()+" Salary:"+e.getSalary()+" Age:"+e.getAge());
		}System.out.println("==========================================================");
		System.out.println();
		
	}
	public void toUpdateSalary(ArrayList<EmployeeApp> al,int id,int salary) {
	  int count=0;
//			for(int i=0;i<al.size();i++)
//			{
//				EmployeeApp e=al.get(i);
//				if(e.getId()==id)
//				{
	                   for(EmployeeApp e:al) {
	                	   if(e.getId()==id) {
					e.setSalary(salary);
					System.out.println("After updating salary");
					System.out.println("Id:"+e.getId()+"  Name:"+e.getName()+"  Salary:"+e.getSalary()+"  Age:"+e.getAge());
					count++;
					System.out.println("=============================================================");
					System.out.println();
					break;
				}
		
		  }	
			if(count==0){
				System.out.println("Id not Found");
			} 
	}
}
