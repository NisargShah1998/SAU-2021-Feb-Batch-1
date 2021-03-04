package com.nisarg.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	private long did;
	private String departmentName;
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
