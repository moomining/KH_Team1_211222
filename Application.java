package com.greedy.level01.basic;

public class Application {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.checkMethod();
		
		System.out.println("1부터 10까지의 합 : "+calc.sum1to10());
		
		int number1 = 10;
		int number2 = 20;
		
		System.out.print("두 수 중 큰 수는 ");
		
		calc.checkMaxNumber(number1, number2);
		System.out.println("이다.");
		
		
		System.out.println("10과 20의 합은 : "+calc.sumTwoNumber(number1, number2));

		System.out.println("10과 5의 차는 : "+calc.minusTwoNumber(10, 5));
		
	}

}
