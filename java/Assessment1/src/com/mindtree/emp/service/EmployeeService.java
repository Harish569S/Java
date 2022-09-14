package com.mindtree.emp.service;

import java.util.ArrayList;

import com.mindtree.enploy.app.EmployeeApp;

public interface EmployeeService {
	void toPrint(ArrayList<EmployeeApp> al);
	void toPrintInDesc(ArrayList<EmployeeApp> al);
	void toUpdateSalary(ArrayList<EmployeeApp> al,int id,int salary);
}
