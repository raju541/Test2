package com.cts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo  {

	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEmpname("prasad");
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEmpname("hari");
		Emp e3=new Emp();
		e3.setEid(1);
		e3.setEmpname("prasad");
		
		List list=new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(1);
		//System.out.println(e1.hashCode());
		//System.out.println(e3.hashCode());
		for (Object p1 : list) {
			if(p1 instanceof Emp ) {
			Emp p=(Emp)p1;
			System.out.println(p.getEid()+" "+p.getEmpname());
			}else if(p1 instanceof Integer  ) {
				
				System.out.println(p1);
			}
			
		}
		
		/*Iterator<Emp> itr =list.iterator();
		while(itr.hasNext()) {
			Emp e=itr.next();
			System.out.println(e.getEid()+" "+e.getEmpname());
		}*/
		
		
	}

}
