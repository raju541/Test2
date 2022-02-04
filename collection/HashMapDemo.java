package com.cts.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.cts.collection.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(1,"raju");
		Student s2=new Student(2,"hari");
		Student s3=new Student(3,"prasad");
		Student s4=new Student(4,"kiran");
		Student s5=new Student(2,"hari");
		Student s6=new Student(0,null);
		Student s7=new Student(4,"prasad");
		
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		map.put(s1, 1);
		map.put(s2, 1);
		map.put(s3, 1);
		map.put(s4, 1);
		map.put(s5, 1);
		map.put(s6, 1);
		map.put(s7, 1);
		
		Set<Map.Entry<Student,Integer>> set=map.entrySet();
		Iterator<Map.Entry<Student,Integer>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Student, Integer> entry=itr.next();
			System.out.println(entry.getKey());
		}
	}

}
