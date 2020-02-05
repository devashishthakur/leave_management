package com.sapient.lms.service;

import com.sapient.lms.model.Employee;

public class LeaveManager {
	
	int numberOfLeaves;
	
	public LeaveManager(Employee employee)
	{
		this.numberOfLeaves = employee.getLeaveDetail().getNoOfLeaves();
	}
	
	public void applyForLeave(int numberOfLeaves)
	{
		this.numberOfLeaves = this.numberOfLeaves - numberOfLeaves;
	}
	
	public int viewLeaveBalance()
	{
		return this.numberOfLeaves;
	}
	
	public void updateLeaveBalance(int numberOfLeaves)
	{
		this.numberOfLeaves = this.numberOfLeaves + numberOfLeaves;
	}
}
