package mock8_3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	static Boolean validateEmailId(String email) {
		String pattern = "^[A-Za-z][a-zA-Z0-9._]*@[a-zA-Z]+\\.[a-zA-Z]{2,6}";
		if (Pattern.matches(pattern, email))
			return true;
		return false;

	}

	static Boolean validateSpam(String email) {
		System.out.println(email);
		String[] spamDomains = { "advancedpdfconverter", "passwordmaster", "smartfixer", "downloadavideo" };
		String[] in = email.split("\\.");
		for (String s : in)
			System.out.println(s);
		for (String s : spamDomains)
			if (in[0].split("@")[1].equals(s))
				return false;

		return true;

	}

	public static void main(String[] args) {
		System.out.println("Menu:\r\n" + "1.Validate Email\r\n" + "2.Check for Spam\r\n" + "");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the email to be validated:");
		String email = scanner.nextLine();
		switch (choice) {
		case 1: {
			if (validateEmailId(email))
				System.out.println("Email is valid");
			else
				System.out.println("Email is invalid");
			break;

		}
		case 2: {
			if (validateSpam(email))
				System.out.println("Email is not spam");
			else
				System.out.println("Email is spam");
			break;

		}
		default: {
			scanner.close();
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		}
		scanner.close();
	}

}
