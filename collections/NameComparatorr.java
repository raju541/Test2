package com.cts.collections;

import java.util.Comparator;

public class NameComparatorr implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator s1, StudentComparator s2) {
		// TODO Auto-generated method stub
		
		return s1.getName().compareTo(s2.getName());
	}
	
	
}
