package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EmployeeComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list=new ArrayList<Employee>();
		
		Employee e1=new Employee(101,"raju",27);
		Employee e2=new Employee(102,"hari",29);
		Employee e3=new Employee(103,"kiran",28);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println("Sorting by ID");
		Collections.sort(list,new IdComparator());
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Sorting by NAME");
		Collections.sort(list,new NameComparator());
		for (Employee sc : list) {
			System.out.println(sc);
		}
		System.out.println("Sorting by AGE");
		Collections.sort(list,new AgeComparator());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}

}
