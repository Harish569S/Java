package com.mindtree.costumer.inter;

import java.util.ArrayList;

import com.mindtree.customer.entity.Customer;

public interface CustomerService {
     public void toPrint(ArrayList<Customer> cus);
     public void cusInDesc(ArrayList<Customer> cus);
     public void Update(ArrayList<Customer> cus,int id);
}
