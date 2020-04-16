package com.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class EmployeeNew{
	String empName;
	double salary;
	public EmployeeNew(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}
	
	public static List<EmployeeNew> populateDummyEmployees(){
		List<EmployeeNew> empList =  new ArrayList<EmployeeNew>();
		empList.add(new EmployeeNew("Annie", 5500));
		empList.add(new EmployeeNew("Barnie", 8000));
		empList.add(new EmployeeNew("Ginnie", 11500));
		empList.add(new EmployeeNew("Ronnie", 10700));
		empList.add(new EmployeeNew("Vinnie", 4600));
		return empList;
	}
	
}

public class PredicatesWithLambda {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(10));
		
		Integer[] intArr = {10,5,8,15,12,14,19};
		for(int itr : intArr){
			if(p.test(itr)){
				System.out.println(itr);
			}
		}
		
		//Predicate join example
		Predicate<Integer> pr = i -> i>10;
		for(int itr : intArr){
			if(p.and(pr).test(itr)){
				System.out.println(itr);
			}
		}
		
		//working with user defined custom class
		List<EmployeeNew> employees = EmployeeNew.populateDummyEmployees();
		Predicate<EmployeeNew> empPred = emp -> emp.salary>10000;
		
		for(EmployeeNew employee : employees){
			if(empPred.test(employee)){
				System.out.println(employee);
			}
		}

	}

}
