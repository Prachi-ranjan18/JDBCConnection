package com.implementCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListimplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(15);
		list.add(90);
		list.add(78);
		list.add(56);
		Iterator<Integer> i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
