package com.exceptionExample;

public class UserException extends Exception {
	String Message;
	//int num;
	public UserException(String Msg,int n) {
		//super();
		this.Message =Msg ;
		//this.num=n;
	}
	public void show() {
		System.out.println("Exception handeled by User");
	}

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		UserException obj=new UserException("Inside UserException Class",5);
		System.out.println(obj);
		obj.show();
	}

}
