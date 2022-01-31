package com.iiht.training.reflections;

import java.util.Scanner;

public class StringAlphabetReflection {

	public static void main(String[] args) {

		StringAlphabetReflection reflectionObj = new StringAlphabetReflection();
		Scanner sc = new Scanner(System.in);
		String message = sc.next();
		String reflection = reflectionObj.findReflection(message);
		System.out.println(reflection);

	}

	public  String findReflection(String message) {
		// Write Code Here
		return "";
	}

}
