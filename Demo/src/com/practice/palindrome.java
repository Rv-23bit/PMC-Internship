package com.practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int r,temp,sum=0;
		
		temp = num;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10) + r;
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println("Its a palindrome.");
		}
		else if(temp != sum) {
			System.out.println("Not a palindrome.");
		}
		input.close();
	}

}
