package com.mindtree.intrerf;
import com.mindtree.assignment.entity.Student;
import com.mindtree.exception.NotValidIdExcep;
import java.util.*;
public interface StudentService {
        void printDetails(ArrayList<Student> p);
        void printInAsc(ArrayList<Student> p1);
        void printInDesc(ArrayList<Student> p2);
        void printUpdates(ArrayList<Student> p3,int id,int updatedMark) throws NotValidIdExcep;
}
