package com.mindtree.service;

import java.util.*;
import com.mindtree.assignment.entity.Student;
import com.mindtree.exception.NotValidIdExcep;
import com.mindtree.intrerf.StudentService;

public class StudentServiceClass implements StudentService{

	public void printDetails(ArrayList<Student> p) {
		for(Student ref:p)
		{
			System.out.println("Student name:"+ref.getName()+" Id="+ref.getId()+" Marks="+ref.getMarks());
		}}	
	
	public void printInAsc(ArrayList<Student> p1) {
		ArrayList<Student> copy=new ArrayList<>(p1);
		Collections.sort(copy);
		for(Student ref:copy)
		{
			System.out.println("Student name:"+ref.getName()+" Id="+ref.getId()+" Marks="+ref.getMarks());
		}		}


	public void printInDesc(ArrayList<Student> p2) {
		ArrayList<Student> copy=new ArrayList<>(p2);
		Collections.sort(copy,Collections.reverseOrder());
		Iterator it=copy.iterator();
		while(it.hasNext())
		{
			Student ss=(Student) it.next();
			System.out.println("Name:"+ss.getName()+" Id="+ss.getId()+" Marks="+ss.getMarks());
		}
//		for(Student ref:copy)
//		{
//			System.out.println("Student name:"+ref.getName()+" Id="+ref.getId()+" Marks="+ref.getMarks());
//		}
//		
	}

	@Override
	public void printUpdates(ArrayList<Student> p3, int id, int updatedMark) throws NotValidIdExcep {
		int count=0;
		for(int i=0;i<p3.size();i++)
		{      Student s=p3.get(i);
			if(s.getId()==id)
			{
				s.setId(updatedMark);
				count++;
				break;
			}
		}
		if(count==0)
		{
			throw new NotValidIdExcep("Id not found");
		}
		System.out.println("Updated Details");
		for(Student ref:p3)
		{
			System.out.println("Student name:"+ref.getName()+" Id="+ref.getId()+" Marks="+ref.getMarks());
		}
	}

}
