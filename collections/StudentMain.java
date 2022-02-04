package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentComparator st1=new StudentComparator(103,"Rajan",28);
		StudentComparator st2=new StudentComparator(101,"Hari",29);
		StudentComparator st3=new StudentComparator(102,"Ali",27);
		
		List<StudentComparator> list=new ArrayList<StudentComparator>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		System.out.println(list);
		System.out.println(" ");
		System.out.println("Sorting by id");
		Collections.sort(list,new IdComparatorr());
		Iterator<StudentComparator> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" ");
		System.out.println("Sorting by name");
		Collections.sort(list,new NameComparatorr());
		for (StudentComparator s : list) {
			System.out.println(s);
		}
		System.out.println(" ");
		System.out.println("Sorting by age");
		Collections.sort(list,new AgeComparatorr());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
