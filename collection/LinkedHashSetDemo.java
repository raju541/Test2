package com.cts.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"hari");
		Student s2=new Student(2,"kiran");
		Student s3=new Student(3,"raju");
		Student s4=new Student(1,"prasad");
		Student s5=new Student(3,"raju");
		Student s6=new Student(0,null);
		Student s7=new Student(2,"prasad");
		
		Set<Student> set=new LinkedHashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		set.add(null);
		set.add(null);
		
		Iterator<Student> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*for (Student student : set) {
			System.out.println(student);
		}*/

	}

}
