package com.cts.collections;

import java.util.Comparator;

public class IdComparatorr implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator s1, StudentComparator s2) {
		// TODO Auto-generated method stub
		
		if(s1.getId()==s2.getId()) 
			return 0;
		else
			if(s1.getId()>s2.getId())
				return 1;
			else
				return -1;
	}
}


