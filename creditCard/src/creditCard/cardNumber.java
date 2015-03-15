package creditCard;

import java.util.Scanner;

public class cardNumber {
	
	public static String getNumber() {
		Scanner input = new Scanner(System.in);
		String number;
			// Prompt the user to enter the credit card number, one digit at a
			// time, and add it to the array of ints
			System.out.println("Please enter the credit card number: ");
			number = input.next();
		return number;
	}
	
	public static boolean isValid(String number) {
		int sum = 0;
		for(int i = number.length() - 1; i >= 0; i--) {
			int num = Character.digit(number.charAt(i), 10);
			if(i % 2 == 0) {
				if((num * 2) < 9) {
					sum += num * 2;
				}
				else {
					sum += (num * 2) - 9;
				}
			}
			else {
				sum += num;
			}
		}
		if(sum % 10 == 0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		String number = getNumber();
		if(isValid(number)) {
			System.out.println("The number is valid.");
		}
		else {
			System.out.println("The number is invalid.");
		}

	}

}
