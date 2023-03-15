package com.obsqura.training;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Number{

	static Logger log = Logger.getLogger(Number.class.getName());
	
	public static int factorial(int number){
		int i = 1 , factorial =1;
		while(i<=number){

			factorial = factorial * i;
			i++;
		}
		return factorial;
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number;
		number = sc.nextInt();
		int factorial = Number.factorial(number);
		System.out.println("The factorial of " + number + " is :" + factorial);
	}

}