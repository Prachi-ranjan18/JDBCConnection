package com.implementCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> subjects= new HashSet<String>();
	    subjects.add("Datastructures");
	    subjects.add("Compiler Design");
	    subjects.add("Operating System");
	    subjects.add("Automata");
	    subjects.add("DBMS");
	    Iterator<String> i=subjects.iterator();
	    
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	}

}
