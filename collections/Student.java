package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	
	int id,age;
	String name;
	
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
@Override
public int compareTo(Student sc) {
	if(age==sc.age)
		return 0;
	else
		if(age>sc.age)
			return 1;
		else
			return -1;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<Student> list=new ArrayList<Student>();
	Student s1=new Student(101,"raju",27);
	Student s2=new Student(102,"hari",29);
	Student s3=new Student(103,"kiran",28);
	list.add(s1);
	list.add(s2);
	list.add(s3);
	Collections.sort(list);
	for (Student st : list) {
		System.out.println(st.id+" "+st.name+" "+st.age);
	}
}

}
