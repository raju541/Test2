package com.cts.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"raju");
		Student s2=new Student(2,"hari");
		Student s3=new Student(3,"kiran");
		Student s4=new Student(3,"raju");
		Student s5=new Student(3,"raju");
		Student s6=new Student(0,null);
		Student s7=new Student(0,"prasad");
		Set<Student> set=new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		set.add(null);
		set.add(null);
		ConcurrentHashMap<Student, Integer> certificationCosts = new ConcurrentHashMap<Student, Integer>();
		certificationCosts.put(s1, 1);
		certificationCosts.put(s2, 1);
		certificationCosts.put(s3, 1);
		Set<Student> set1 = certificationCosts.keySet();
		Iterator<Student> itr=set1.iterator();
		while(itr.hasNext()) {
				set1.remove(s3);
				System.out.println(itr.next());
			
			}
		}
		
		/*for (Student student : set) {
			System.out.println(student);
		}*/
	
}
