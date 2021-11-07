package org.opentutorials.javatutorials.condition.loginDemo;

import java.util.Scanner;

public class ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String id = null;
	id = input.next();
	if(id.equals("egoing")) {
		System.out.println("right");
	}else {
		System.out.println("wrong");
	}
}
}
