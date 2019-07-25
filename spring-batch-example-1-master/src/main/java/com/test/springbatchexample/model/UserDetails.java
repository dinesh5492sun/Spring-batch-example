package com.test.springbatchexample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
		
	@Id
    private Integer id;
    private String dept;
    private Date time;
	
    public UserDetails() {
		super();
		
	}
    public UserDetails(Integer id, String dept, Date time) {
		super();
		this.id = id;
		this.dept = dept;
		this.time = time;
	}
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
    
    
    
    
    
}
