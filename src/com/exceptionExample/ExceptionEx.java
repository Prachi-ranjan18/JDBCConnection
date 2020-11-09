package com.exceptionExample;

public class ExceptionEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=3,num2=5,result;
		try {
			if(num2==5)
				throw new UserException("Dividing by 5 error",5);
//			else
//				result=num1/num2;
		}
		catch(UserException e){
			e.show();
		}
		
	}

}
