package com.cg.eis.service;
import com.cg.eis.bean.*;
import java.util.*;
public class Service implements EmployeeService{
	Employee[] empList = new Employee[3];

	@Override
	public void displayDetails() {
		System.out.println("The Employee Details are as follows: ");
		for(int i=0; i<3; i++) {
			
			System.out.println("Emp_Id: "+empList[i].getId());
			System.out.println("Emp_Name: "+empList[i].getName());
			System.out.println("Emp_Salary: "+empList[i].getSalary());
			System.out.println("Emp_Desgination: "+empList[i].getDesignation());
			System.out.println("Emp_Insurance_Scheme: "+empList[i].getInsuranceScheme());
			
		}
	}

	@Override
	public void findScheme() {
		for(int i=0; i<3; i++) {
			if(empList[i].getSalary()>=10000 && empList[i].getSalary()<=15000) {
				empList[i].setInsuranceScheme("Scheme A");
				System.out.println(empList[i].getName()+" is eligible for "+empList[i].getInsuranceScheme());
			}
			else if(empList[i].getSalary()>=15000 && empList[i].getSalary()<=50000) {
				empList[i].setInsuranceScheme("Scheme B");
				System.out.println(empList[i].getName()+" is eligible for "+empList[i].getInsuranceScheme());
			}else {
				System.out.println(empList[i].getName()+" is not Eligible for any Scheme.");
			}
		}
		
	}

	@Override
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
		System.out.println("Enter Emp_Id: ");
		empList[i].setId(sc.nextInt());
		
		System.out.println("Enter Emp_Name: ");
		empList[i].setName(sc.nextLine());
		
		System.out.println("Enter Emp_Salary: ");
		empList[i].setSalary(sc.nextDouble());
		
		System.out.println("Enter Emp_Designation: ");
		empList[i].setDesignation(sc.nextLine());
		}
		sc.close();
	}
	

}
