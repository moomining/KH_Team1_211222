package com.greedy.level02.normal;



public class RandomMaker {
	
	public int randomNumber(int min, int max) {
		int result = (int)(Math.random()*(max-min+1))+min;
		return result;
	}
		
	public String randomUpperAlpabet(int length) {
		
	char UpperAlpabet1 = (char)((int)(Math.random()*26)+65);
	char UpperAlpabet2 = (char)((int)(Math.random()*26)+65);
	String result = (char)UpperAlpabet1+(char)UpperAlpabet2+"";
	
	return result;
	}
	
	
	public String rockPaperScissors() {
		
		String[] strArr = {"가위","바위","보"};
		int number = (int)(Math.random()*3);
				
		return strArr[number];
	}
	
	public String tossCoin() {
		String[] tossArr = {"앞면","뒷면"};
		int number = (int)(Math.random()*2);
				
		return tossArr[number];
	}
	
}
