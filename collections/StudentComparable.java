package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable> {
	
	int rollno;
	String name;
	int age;
	
	public StudentComparable(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(StudentComparable sc) {
		// TODO Auto-generated method stub
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

			List<StudentComparable> list=new ArrayList<StudentComparable>();
			StudentComparable sc1=new StudentComparable(101,"Hari",30);
			StudentComparable sc2=new StudentComparable(102,"Rajan",27);
			StudentComparable sc3=new StudentComparable(103,"Kamal",29);
			StudentComparable sc4=new StudentComparable(104,"Chandu",28);
			list.add(sc1);
			list.add(sc2);
			list.add(sc3);
			list.add(sc4);
			System.out.println("Before Sorting");
			for (StudentComparable stc : list) {
				System.out.println(stc.rollno+ " " +stc.name+ " " +stc.age);
			}
			System.out.println(" ");
			Collections.sort(list);
			System.out.println("After Sorting");
			for (StudentComparable stc : list) {
				System.out.println(stc.rollno+ " " +stc.name+ " " +stc.age);
			}
	}
}