package com.Bridgelabz;

import java.util.Scanner;

public class GenericsMain extends MaximumGenerics {
		// Scanner Class for user input
		static Scanner scanner = new Scanner(System.in);
		/**
		 * 
		 * @param args
		 */
		public static void main(String[] args) {
			System.out.println("Maximum of three number");
			// Taking 3 numbers from user
			Integer x = scanner.nextInt();
			Integer y = scanner.nextInt();
			Integer z = scanner.nextInt();
			System.out.println("Maximum is  " + maximum(x, y, z));
		}
}
