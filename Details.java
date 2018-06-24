package com.visam.maven_demo1;
import java.util.*;

public class Details {

	public String name;
	public String score;
	public String salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		score = score;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		salary = salary;
	}
	public void insertData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		 name=sc.nextLine();
		 System.out.println("enter score");
		 score=sc.nextLine();
		 System.out.println("enter salary");
		 salary=sc.nextLine();
		 
		 sc.close();
	}
  
}


