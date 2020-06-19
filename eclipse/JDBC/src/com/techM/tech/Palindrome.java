package com.techM.tech;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		int result=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer");
		int num=sc.nextInt();
		System.out.println("hii");

		int temp=num;

		System.out.println("bye..");

		while(temp>0)
		{
			int remainder =temp%10;
			result = result*10+remainder;
			int divider = temp/10;
		}

		if(num==result)
			System.out.println("---------palindrome----------");
		else
			System.out.println("-----------Not palindrome----------"); 
	}
}
