package com.cts.collection;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id+" "+name;
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.id==((Student)obj).id && this.name.equals(((Student)obj).name);
	}


	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(id==st.id)  
			return 0;  
			else if(id>st.id)  
			return 1;  
			else  
			return -1;  
	}

}
