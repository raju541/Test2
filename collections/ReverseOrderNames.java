package com.cts.collections;

import java.util.*;

public class ReverseOrderNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Rajan");
		list.add("Hari");
		list.add("Ali");
		list.add("Nani");
		list.add("Chandu");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		/*
		 * Collections.sort(list); System.out.println("Sorted list is:"+list);
		 * 
		 * Collections.reverse(list); System.out.println("Reversed order is:"+list);
		 */
		  
		 

	}

}
