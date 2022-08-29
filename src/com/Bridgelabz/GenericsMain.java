package com.Bridgelabz;

import java.util.Scanner;

public class GenericsMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Maximum of Integers is "+MaximumGenerics.toPrintMax(10,20,18));
		System.out.println("Maximum of Float is " +MaximumGenerics.toPrintMax(10.7f,20.4f,17.7f));
		System.out.println("Maximum of three Strings is" +MaximumGenerics.toPrintMax("grapes","apple","orange"));
	}}
