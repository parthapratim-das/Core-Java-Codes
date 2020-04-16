package com.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	
	String stuName;
	int stuMarks;
	
	public Student(String stuName, int stuMarks) {
		super();
		this.stuName = stuName;
		this.stuMarks = stuMarks;
	}


	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuMarks=" + stuMarks + "]";
	}
	
	public static List<Student> getDummyStudentList(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Adarsh",80));
		studentList.add(new Student("Partha",75));
		studentList.add(new Student("Nayan",93));
		studentList.add(new Student("Rohan",83));
		studentList.add(new Student("Prashant",43));
		return studentList;
	}
	
}

public class FunctionPredicateOnStudentGrading {
	
	public static void main(String[] args){
		
		Function<Student,String> f = stu ->{
			int marks = stu.stuMarks;
			String grade = "";
			Predicate<Integer> pA = m -> m>80;
			Predicate<Integer> pB = m -> m>70;
			Predicate<Integer> pC = m -> m>60;
			Predicate<Integer> pD = m -> m>40;
			
			if(pA.test(marks)){ 
				grade = "A Grade";
			}else if(pB.test(marks)){
				grade = "B Grade";
			}else if(pC.test(marks)){
				grade = "C Grade";
			}else if(pD.test(marks)){
				grade = "D Grade";
			}
			return grade;
		};
		
		List<Student> students = Student.getDummyStudentList();
		
		Comparator<Student> cpr = (s1,s2) -> (s1.stuMarks>s2.stuMarks)?1:(s1.stuMarks<s2.stuMarks)?-1:0;
		Collections.sort(students, cpr);
		System.out.println(students);
		for(Student s : students){
			System.out.println(s.stuName+" "+f.apply(s));
		}
	}

}
