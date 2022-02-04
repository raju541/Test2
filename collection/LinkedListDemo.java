package com.cts.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEmpname("raju");
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEmpname("kiran");
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEmpname("hari");
		Emp e4=new Emp();
		e4.setEid(0);
		e4.setEmpname(null);
		
		List<Emp> list=new LinkedList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e1);
		
		Iterator<Emp> itr=list.iterator();
		while(itr.hasNext()) {
			Emp e=itr.next();
			System.out.println(e.getEid()+" "+e.getEmpname());
		}
		
		/*for (Emp e : list) {
			System.out.println(e.getEid()+" "+e.getEmpname());
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEid()+" "+list.get(i).getEmpname());
		}*/
	}

}
