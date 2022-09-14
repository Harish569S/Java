package com.minddtree.assignment.main;

import java.util.*;

import com.mindtree.assignment.entity.Student;
import com.mindtree.exception.NotValidIdExcep;
import com.mindtree.intrerf.StudentService;
import com.mindtree.service.StudentServiceClass;

public class ClassforMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         ArrayList<Student> arList=new ArrayList<>();
         Student s;
         int flag=1;
         System.out.println("====Welcome====");
         System.out.println("Enter number of students:");
         int  N=sc.nextInt();
       
        	 for(int i=0;i<N;i++)
        	 {
        		 System.out.println("Enter the name of the student");
        		String name=sc.next();
        		 System.out.println("Enter the Id of student");
        		 int id=sc.nextInt();
        		 System.out.println("Enter the marks of student");
        		 int marks=sc.nextInt();
        		 Student stud=new Student(marks,id,name);
        		 stud.setId(id);
        		 stud.setMarks(marks);
        		 stud.setName(name);
        		 arList.add(stud);
        	 }  while(flag==1)
             {
        	 System.out.println("Enter: 1 To show the students details"
        	 		+ "\nEnter: 2 To show the students details according to ascending order of there name"
        	 		+ "\nEnter: 3 To show the students details according to descending order of there name"
        	 		+ "\nEnter: 4 To update the marks of the student"
        	 		+ "\nEnter: 5 To Exit");
            int choice=sc.nextInt();
            switch(choice)
            {
            case 1:  StudentService it=new StudentServiceClass();
            	it.printDetails(arList);
                     break;
            case 2:  StudentService it1=new StudentServiceClass();
            	it1.printInAsc(arList);
            break;
            case 3: StudentService it2=new StudentServiceClass();
            	it2.printInDesc(arList);
            break;
            case 4:System.out.println("Enter the id of student");
                     int  ids=sc.nextInt();
            	     System.out.println("Enter the marks to update");
                      int marks1=sc.nextInt();
                      StudentService it3=new StudentServiceClass();
                      try {
            	           it3.printUpdates(arList,ids,marks1);}
                      catch(NotValidIdExcep ex){
                    	  System.out.println(ex.getMessage());
                    	  
                      }
            break;
            case 5:System.exit(0);
            
            }
            
            System.out.println("Enter 1 to continue");
            flag=sc.nextInt();
            
         }
         
     
         
         
         
	}

}
