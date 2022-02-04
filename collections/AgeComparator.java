package com.cts.collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			
			if(e1.getAge()==e2.getAge())
				return 0;
			else
				if(e1.getAge()>e2.getAge())
					return 1;
				else
					return -1;
		}
}
