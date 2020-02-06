package com.sapient.lms.service;

import java.util.Date;

import com.sapient.lms.model.Employee;

public class LeaveManager {
	
	int numberOfLeaves;
	
	public LeaveManager(Employee employee)
	{
		this.numberOfLeaves = employee.getLeaveDetail().getNoOfLeaves();
	}
	
	public void applyForLeave(Date from, Date to, int numberOfLeaves)
	{
		System.out.println("You applied for leave from "+from.toString()+ " to "+to.toString());
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
