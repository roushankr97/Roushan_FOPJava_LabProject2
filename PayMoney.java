package com.greatlearning.dsa;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("Enter size of transaction array");
		int n = s.nextInt();
		int[] transactions = new int[n];
		System.out.println("Enter the value of array");
		for (int i = 0; i < n; i++) {
			transactions[i] = s.nextInt();

		}
		System.out.println("Enter total no of targets that needs to be acheived ");
		int targetNo = s.nextInt();
		for (int i = 0; i < targetNo; i++) {

		}
		System.out.println("Enter the value of target");
		int target = s.nextInt();
		int sum = 0;
		int j;
		for (j = 0; j < n; j++) {
			sum = sum + transactions[j];
			if (sum >= target) {
				System.out.println("Target acheived after" + (j + 1) + "transactions");
				break;
			}
		}
		if (j == n) {
			System.out.println("Given target not acheived");
		}
		s.close();
	}
}
