package com.greedy.level01.basic;

public class Calculator {

	public void checkMethod() {
		System.out.println("메소드 호출 확인");
	}
	
	public int sum1to10() {
		
		return (1+10)*10/2;
		
	}
	
	public void checkMaxNumber(int a, int b) {
		int result = a>b ? a : b ;
		
		
		return ;
		
	}
	
	public int sumTwoNumber(int a, int b) {
		
		return a+b;
	}
	
	public int minusTwoNumber(int a, int b) {
		
		return a-b;
	}
	
}
