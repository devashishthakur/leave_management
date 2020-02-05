package com.sapient.lms.model;

public class LeaveDetail {
	
	int noOfLeaves = 20;
	
	public LeaveDetail(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

	public LeaveDetail(){}
	
	public int getNoOfLeaves() {
		return noOfLeaves;
	}

	public void setNoOfLeaves(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}
}
