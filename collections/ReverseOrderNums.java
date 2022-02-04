package com.cts.collections;

import java.util.*;

public class ReverseOrderNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
