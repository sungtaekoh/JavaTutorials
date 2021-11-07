package org.opentutorials.javatutorials.array;

public class ForeachDemo {
		//for -each문
	public static void main(String[] args) {
		String[] members = {"최진혁","최유빈","박보람"};
		for(String e :members) {
			System.out.println( e + "이 상담을 받았습니다");
		}
	}
}
