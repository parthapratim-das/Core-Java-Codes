package com.hashcodeequals;

import java.util.HashMap;
import java.util.Map;

public class HashcodeEquals {

	public static void main(String[] args) {
		Map<Employee,String> employees = new HashMap<>();
		Employee empA = new Employee(1, "Jones");
		Employee empB = new Employee(1, "Jones");
		
		employees.put(empA, "Jones");
		employees.put(empB, "Jones");
		
		System.out.println(employees.size());
		
		Map<Integer,String> integers = new HashMap<>();
		integers.put(new Integer(1), "Hack");
		integers.put(new Integer(1), "Hack");
		
		System.out.println(integers.size());

	}

}

class Employee{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
	
}
