package com.implementCollections;

import java.util.ArrayList;
import java.util.Iterator;


public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> arr=new ArrayList<Employee>();
		Employee e1=new Employee(1000,"Jasmine",45000);
		Employee e2=new Employee(1001,"Jack",45000);
		Employee e3=new Employee(1002,"Jimmy",50000);
		Employee e4=new Employee(1005,"Steve",15000);
		
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.add(e4);
		Iterator<Employee> i=arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
