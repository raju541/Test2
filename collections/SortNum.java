package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		Collections.sort(list);
		System.out.println("Sorted numbers are: "+list);
		
		
		/*
		 * Iterator<Integer> itr=list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * for (Integer i : list) { System.out.println(i); }
		 * 
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i));}
		 */

	}

}
