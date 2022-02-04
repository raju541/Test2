package com.cts.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"raju");
		Student s2=new Student(2,"hari");
		Student s3=new Student(3,"prasad");
		Student s4=new Student(4,"kiran");
		Student s5=new Student(4,"kiran");
		
		
		Teacher t1=new Teacher(101,"kiran");
		Teacher t2=new Teacher(102,"prasad");
		Teacher t3=new Teacher(103,"hari");
		Teacher t4=new Teacher(104,"raju");
		
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		map.put(s1, 1);
		map.put(s2, 1);
		map.put(s3, 1);
		map.put(s4, 1);
		map.put(s5, 1);
		Set<Map.Entry<Student,Integer>> set=map.entrySet();
		Iterator<Map.Entry<Student,Integer>> itr=set.iterator();
		System.out.println("Students details are: ");
		while(itr.hasNext()) {
			Entry<Student, Integer> entry=itr.next();
			System.out.println(entry.getKey());
		}
		
		Map<Teacher, Integer> map1=new HashMap<Teacher, Integer>();
		map1.put(t1, 1);
		map1.put(t2, 1);
		map1.put(t3, 1);
		map1.put(t4, 1);
		Set<Map.Entry<Teacher,Integer>> set1=map1.entrySet();
		Iterator<Map.Entry<Teacher,Integer>> itr1=set1.iterator();
		System.out.println("Teachers details are: ");
		while(itr1.hasNext()) {
			Entry<Teacher, Integer> entry=itr1.next();
			System.out.println(entry.getKey());
		}
		
		
		

	}

}
