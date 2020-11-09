package com.implementCollections;

public class Employee {
	private int Eid;
	private String Ename;
	private float Esalary;
	
	public Employee(int id, String name,float salary) {
		this.Eid=id;
		this.Ename=name;
		this.Esalary=salary;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int id) {
		this.Eid=id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String name) {
		this.Ename=name;
	}
	public float getEsalary() {
		return Esalary;
	}
	public void setEsalary(float salary) {
		this.Esalary=salary;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Esalary=" + Esalary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(5,"Simmy",35000);
		System.out.println(e1);
	}

}
