package com.sapient.lms.model;

public class Employee {
	
	int id;
	String name,department;
	LeaveDetail leaveDetail;
	
	public Employee(int id, String name, String department, LeaveDetail leaveDetail) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.leaveDetail = leaveDetail;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LeaveDetail getLeaveDetail() {
		return leaveDetail;
	}
	public void setLeaveDetail(LeaveDetail leaveDetail) {
		this.leaveDetail = leaveDetail;
	}
}
