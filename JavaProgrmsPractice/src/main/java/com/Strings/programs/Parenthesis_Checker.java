package com.Strings.programs;

public class Parenthesis_Checker {
	static boolean isValidExpression(String x) {
		// add your code here
		// traverse over the string
		// check if the char is repeated twice or not
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		boolean check = true;
		if (x.length() % 2 != 0) {
			System.out.println("not balanced");
			check = false;
		} else {
			for (char c : x.toCharArray()) {
				if (c == '{') {
					count1++;
				} else if (c == '}') {
					count1--;
					if (count1 < 0) {
						check = false;
					}
				}

				if (c == '(') {
					count2++;
				} else if (c == ')') {
					count2--;
					if (count1 < 0) {
						check = false;
					}
				}

				if (c == '[') {
					count3++;
				} else if (c == ']') {
					count3--;
					if (count1 < 0) {
						check = false;
					}
				}
			}

			if (count1 == 0 && count2 == 0 && count3 == 0) {
				System.out.println("balanced");
				check = true;
			} else {
				System.out.println("not balanced");
				check = false;
			}
		}

		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression1 = "[()]{}{[()()]()}";
		String expression2 = "[(])";
		String expression3 = "(";

		System.out.println(isValidExpression(expression1));
		System.out.println(isValidExpression(expression2)); // false
		System.out.println(isValidExpression(expression3)); // false
	}

}
