package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department 

	
	{
		public void  studentName()
		
		{
			System.out.println("SRIKANTH");
			
			
		}
	
public void  studentDept()
		
		{
			System.out.println("Physics");
			
			
		}
	
public void  studentId()

{
	System.out.println("2334444");
	
	
}

	
	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

		College coll = new College();
		
		coll.collegeName();
		
		coll.collegeCode();
		
coll.collegeRank();

Department  dept = new Department();

dept.deptName();


Student stu = new Student();

stu.studentName();

stu.studentDept();

stu.studentId();
		
		
		
		
	}

}
