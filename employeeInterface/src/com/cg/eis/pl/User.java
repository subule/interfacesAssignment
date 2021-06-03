package com.cg.eis.pl;
import com.cg.eis.service.*;
import java.util.*;
public class User {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Enter the Employee Details: ");
		EmployeeService c = new Service();
		c.getDetails();
		
		c.findScheme();
		
		System.out.println("Do you wish to see the employee details?");
		Scanner YorN = new Scanner(System.in);
		boolean response = YorN.hasNext();
		YorN.close();
		if(response) {
			c.displayDetails();
		}
	}

}
