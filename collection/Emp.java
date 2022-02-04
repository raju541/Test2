package com.cts.collection;

import java.util.Objects;

public class Emp {
	private int eid;
	private String empname;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	@Override
    public int hashCode() {
        return Objects.hash(eid, empname);
    }
	@Override
	public boolean equals(Object obj) {
	boolean status;
	Emp emp =(Emp)obj;
	if(this.eid==(emp.getEid()) && this.empname.equals(emp.getEmpname()) ){
		status= true;
		
		}
	else {
			status= false;	
		}
	return status;
}

}
