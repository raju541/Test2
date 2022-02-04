package com.cts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		list.add("raju");
		list.add("kiran");
		list.add("prasad");
		list.add("hari");
		
		int size=list.size();
		String[] str=new String[size];
		String[] item=list.toArray(str);
		for (String string : item) {
			System.out.println(string);
		}
		System.out.println(Arrays.asList(item));
	}

}
