package _02_Intro_to_Switch_Statements;

import java.util.Random;

public class SwitchStatementDemo {
	public static void main(String[] args) {
		// A Switch Statement is simply just another way to write if else statements.
		// The following two blocks of code are logically the same.
		
		{
			int x = new Random().nextInt(3);
			if(x == 0) { 
				System.out.println("0");
			} else if(x == 1) {
				System.out.println("1");
			} else if(x == 2) {
				System.out.println("2");
			} else {
				System.out.println("Something went wrong :(");
			}
		}
		
		{
			/*
			 *  Remove the 'break;' statements and run it again.
			 *  What did you notice? What does 'break;' do?
			 */
			int x = new Random().nextInt(3);
			switch(x) {
			case 0: 
				System.out.println("0");
				break;
			case 1: 
				System.out.println("1");
				break;
			case 2: 
				System.out.println("2");
				break;
			default: 
				System.out.println("Something went wrong :(");
				break;
			}
		}
		
		// Notice the break;
		// This only works when comparing one variable. 
		// That variable cannot be a floating point value.
		// Using objects with switch statements is very limited.
		// It works with Strings and Enums.
	}
}
