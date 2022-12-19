package com.example.demo;

import java.util.Stack;

public class BracescodingProblem {

	public static void main(String[] args) {
		
		String test = "{[(])}";
		
		boolean res = isBracesMatching(test);
		
		if(res) {
			System.out.println("Braces are matching");
		}else {
			System.out.println("Braces are not matching");
		}

	}

	public static boolean isBracesMatching(String str) {

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				
				s.push(str.charAt(i));

			}else {
				
				if(s.isEmpty()) {
					
					return false;
					
				}else if(!isMatching(s.peek(),str.charAt(i))) {
					return false;
				}else {
					s.pop();
				}
				
			}

		}

		return s.isEmpty();

	}
	
	static boolean  isMatching(char a, char b){
		
		if( (a=='{' && b=='}')||(a=='(' && b==')')||(a=='[' && b==']')) {
			
			return true;
		}else {
			return false;
		}
		
	}

}
