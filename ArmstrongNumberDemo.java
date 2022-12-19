package com.example.demo;

import java.util.Scanner;

public class ArmstrongNumberDemo {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number:");

		int number = sc.nextInt();

		// int number = 123;
		int t1 = number;
		int length = 0;

		while (t1 != 0) {
			length = length + 1;
			t1 = t1 / 10;

		}

		int t2 = number;
		int rem = 0;
		int armStrong = 0;
		while (t2 != 0) {

			rem = t2 % 10;

			int mul = 1;

			for (int i = 0; i < length; i++) {

				mul = mul * rem;

			}

			armStrong = armStrong + mul;

			t2 = t2 / 10;

		}

		if (number == armStrong) {

			System.out.println("The given number is ArmstrongNumber");

		} else {

			System.out.println("The given number is not an ArmstrongNumber");

		}

	}
}
