package com.Bridgelabz;

import java.util.Scanner;

public class GenericsMain {

	public static void main(String[] args) {
		// initializing the values and finding the maximum
		System.out.println("Maximum of Integers is " + MaximumGenerics.toPrintMax(10, 20, 18, 22));
		System.out.println("Maximum of Float is " + MaximumGenerics.toPrintMax(10.7f, 20.4f, 17.7f, 9.99f));
		System.out.println("Maximum of three Strings is " + MaximumGenerics.toPrintMax("orange", "Mango", "Banana", "grapes"));
	}
}
