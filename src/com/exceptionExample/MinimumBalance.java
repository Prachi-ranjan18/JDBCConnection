package com.exceptionExample;

public class MinimumBalance extends Exception {
	int Balance;
	String Message;
	public MinimumBalance(String Msg,int balance) {
		super();
		this.Balance = balance;
		this.Message=Msg;
	}
//	public void Show() {
//		System.out.println("Balance is less than 5000!");
//	}
//	public void display() {
//		System.out.println("Balance = "+Balance);
//	}
	
//	@Override
//	public String toString() {
//		return "MinimumBalance [Balance=" + Balance + ", Message=" + Message + "]";
//	}
//	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////		MinimumBalance obj=new MinimumBalance("Balance=",5000);
////		System.out.println(obj);
////		obj.display();
//		
//
//	}

}
