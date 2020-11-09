package com.implementCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> Student_Details=new HashMap<>();
		Student_Details.put(101, "Prachi");
		Student_Details.put(102, "Sammy");
		Student_Details.put(103, "Rahul");
		Student_Details.put(104, "Samuel");
		Student_Details.put(105, "Anmol");
		Iterator<Entry<Integer, String>> i = Student_Details.entrySet().iterator(); 
         
	        while(i.hasNext()) 
	        { 
	             Map.Entry<Integer, String> entry = i.next(); 
	             System.out.println("RollNo. = " + entry.getKey() +  
	                                 ", Student's Name = " + entry.getValue()); 
	        } 
//	// using for-each loop for iteration over Map.entrySet() 
//	        for (Map.Entry<String,String> entry : gfg.entrySet())  
//	            System.out.println("Key = " + entry.getKey() + 
//	                             ", Value = " + entry.getValue()); 


	}

}
