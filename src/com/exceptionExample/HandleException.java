package com.exceptionExample;

import java.util.ArrayList;

public class HandleException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100,num2=0,result;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(500);
		arr.add(900);
		arr.add(700);
		arr.add(6000);
		int current=6000;
//		try {
		
//			result=num1/num2;
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		try {
//			System.out.println(arr.get(6));
//		}
//		catch(IndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
		try {
			if(current>5000) {
				throw new MinimumBalance("Balance is Greater than 5k:",6000);
			}
				
		}
		catch(MinimumBalance e){
			e.printStackTrace();
			//System.out.println("Balance is less than 5k");
		}
	}

}
