package com.greatlearning.app;

import com.greatlearning.Employee;
import com.greatlearning.service.CredService;

public class mainclass {
	
    public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Rishi","Kapoor");
		
		CredService cs = new CredService();
		String generatEmail="";
		char[]genpwd=null;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		System.out.println("please choose the department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HumanResource");
		System.out.println("4.legal");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			generatEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Technical");
            genpwd=cs.generatePassword();
			break;
		case 2:
			generatEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Admin");
			genpwd=cs.generatePassword();    
			break;
		case 3:
			generatEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"HumanResource");
			genpwd=cs.generatePassword(); 
			break;
		case 4:
			generatEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"legal");
			genpwd=cs.generatePassword();    
			break;
		default:
			   System.out.println("please enter valid choice");
		}
		cs.displayEmpDetails(e1.getFirstName(),e1.getLastName(),generatEmail,genpwd);
		
		}
}			
	



