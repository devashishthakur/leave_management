package com.sapient.lms.client;

import java.util.Scanner;

import com.sapient.lms.model.Employee;
import com.sapient.lms.model.LeaveDetail;
import com.sapient.lms.service.InsufficientLeaveBalance;
import com.sapient.lms.service.LeaveManager;

public class LeaveManagerClient {
	
	public static void main(String[] args) throws InsufficientLeaveBalance {
		LeaveDetail leaveDetail = new LeaveDetail(20);
		Employee employee1 = new Employee(0,"Devashish Thakur","Delivery",leaveDetail);
		Employee employee2 = new Employee(1,"Virat Kohli","Cricket",leaveDetail);
		
		Employee[] employeeList = {employee1,employee2};
		
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Employee ID - ");
		int employeeId = ob.nextInt();
		
		Employee employee = employeeList[employeeId];
		LeaveManager leaveManager = new LeaveManager(employee);

		
		while(true)
		{
			
			System.out.println("Welcome "+employee.getName());
			
			System.out.println("1. View Leave Balance\n2. Apply For Leave\n3.Update Leaves");
			
			int inputFromUser = ob.nextInt();
			
			if(inputFromUser == 1)
			{
				System.out.println("Your Leave Balance is " + leaveManager.viewLeaveBalance());
			}
			else if (inputFromUser == 2)
			{
				System.out.println("How much leaves you want " );
				int noOfLeaves = ob.nextInt();
				if(noOfLeaves < leaveManager.viewLeaveBalance())
				{
					leaveManager.applyForLeave(noOfLeaves);
				}
				else
				{
					throw new InsufficientLeaveBalance("You don't have enough leaves");
				}
			}
			else if (inputFromUser == 3)
			{
				System.out.println("How much leaves you want " );
				int noOfLeaves = ob.nextInt();
				leaveManager.updateLeaveBalance(noOfLeaves);
				System.out.println("Updated");
			}

		}
	}

}
