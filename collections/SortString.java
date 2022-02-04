package com.cts.collections;

import java.util.*;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		list.add("Rajan");
		list.add("Hari");
		list.add("Ali");
		list.add("Nani");
		list.add("Chandu");
		Collections.sort(list);
		System.out.println("Sorted list is: "+list);
		
		/*
		 * Iterator<String> itr=list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * for (String string : list) { System.out.println(string); }
		 * 
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 */
		 
	}

}
