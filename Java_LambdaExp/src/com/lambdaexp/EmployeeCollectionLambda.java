package com.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	String empName;
	int salary;
	
	public Employee(String empName, int salary){
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}
	
	public static List<Employee> dummyEmpList(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Sunny",10000));
		empList.add(new Employee("Bunny",15000));
		empList.add(new Employee("Vinny",9000));
		empList.add(new Employee("Anni",11000));
		empList.add(new Employee("Ginny",17000));
		empList.add(new Employee("Tonny",9500));
		return empList;
	}
	
}

public class EmployeeCollectionLambda {
	
	public static void main(String[] args){
		List<Employee> empList = Employee.dummyEmpList();
		
		//sorting based on salary
		Comparator<Employee> c = (e1,e2) -> (e1.salary>e2.salary)?1:(e1.salary<e2.salary)?-1:0;
		Collections.sort(empList, c);
		System.out.println(empList);
		
		//sorting based on name
		Comparator<Employee> cmp = (e1,e2) -> ((e1.empName).compareTo(e2.empName));
		Collections.sort(empList, cmp);
		System.out.println(empList);
	}

}
