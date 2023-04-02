package com.greatlearning.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class PaymentApproach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking input of currency denominations
		System.out.print("Enter the size of currency denominations: ");
		int n = sc.nextInt();
		int[] currency = new int[n];
		System.out.print("Enter the currency denominations value: ");
		for (int i = 0; i < n; i++) {
			currency[i] = sc.nextInt();
		}

		// Sort the denominations in descending order
		Arrays.sort(currency);
		int[] sortedDenominations = new int[n];
		for (int i = 0; i < n; i++) {
			sortedDenominations[i] = currency[n - 1 - i];
		}

		// Taking input of amount to be paid
		System.out.print("Enter the amount you want to pay: ");
		int amount = sc.nextInt();

		// Initializing a counter for the notes used
		int[] notes = new int[n];

		// Using the highest denomination note possible to make the payment first
		for (int i = 0; i < n; i++) {
			while (amount >= sortedDenominations[i]) {
				notes[i]++;
				amount = amount - sortedDenominations[i];
			}
		}

		// Printing the minimum number of notes used to make the payment
		System.out.println("Your payment approach in order to give min no of notes will be:");
		for (int i = 0; i < n; i++) {
			if (notes[i] > 0) {
				System.out.println(sortedDenominations[i] + ":" + notes[i]);
			}
		}

		sc.close();
	}
}
