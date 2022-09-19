package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.Employee;

public class CredService {

	public String generateEmailID(String fname, String sname, String dept)
	{
		return fname+sname+"@"+dept+"tata.com";
	}
	public char[] generatePassword()
	{
		String capletters="ABCDEFGHIJKLMNOPQRSTVUWXYZ";
		String smalletters="abcdefghijklmnopqrstvuwxyz";
		String numbers= "0123456789";
		String spclchars="@#$%&!%";
		String value=capletters+smalletters+numbers+spclchars;
		int i;
		char a[]=new char[8];
		
		Random random=new Random();
		for(i=0;i<8;i++)
		{
          a[i]=value.charAt(random.nextInt(value.length()));
          
		}
		return a;
	}
	public void displayEmpDetails(String fname,String sname,String generateEmail,char[] genpwd)
	{
		
		System.out.println("Dear " + fname +" "+ sname+" Your Generated Credentials is given below :");
		System.out.println("Employee Email ID :"+generateEmail );
		System.out.println("Employee Password :"+genpwd );
		
	}
}

