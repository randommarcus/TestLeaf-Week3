package org.student;

import org.department.*;

public class Student extends Department {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		
		s.deptName();
		
		s.studentName();
		s.studentDept();
		s.studentId();
		
	}
	
	public void studentName() {
		System.out.println("Student Name: Sudarshan");
	}
	
	public void studentDept() {
		System.out.println("Student Department: Faculty of Technology");
	}
	
	public void studentId() {
		System.out.println("Student ID: 9160059");
	}

}
