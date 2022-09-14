package com.mindtree.customer.comp;

import java.util.Comparator;

import com.mindtree.customer.entity.Customer;

public class ClassForComparator implements Comparator<Customer> {


	public int compare(Customer o1, Customer o2) {
	     int value=o2.getName().compareTo(o1.getName());
		return value;
	}

}
