package com.cts.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"hari");
		Student s2=new Student(3,"kiran");
		Student s3=new Student(2,"raju");
		Student s4=new Student(1,"prasad");
		Student s5=new Student(2,"raju");
		
		Set<Student> set=new TreeSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		//set.add(null);
		
		Iterator<Student> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*for (Student student : set) {
			System.out.println(student);
		}*/


	}

}
