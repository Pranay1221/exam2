package com.acts.add;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st no.");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd no.");
		int num2=sc.nextInt();
		
		int add=num1+num2;
		System.out.println("Addition Of Two Numbers is: "+add);
	}

}
