package com.greedy.level02.normal;

public class Application {

	public static void main(String[] args) {
		RandomMaker rm = new RandomMaker();
		int number1 = -20;
		int number2 = 20;
		
		System.out.println(rm.randomNumber(number1, number2));
		
		char ch1 = 'A';
		char ch2 = 'Z';
		
		int number3 = 10;
		
		System.out.println(rm.rockPaperScissors());
		System.out.println(rm.tossCoin());
		
	}

}
