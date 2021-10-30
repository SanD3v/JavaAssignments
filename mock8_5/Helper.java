package mock8_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Helper {
	public static void displayMails(ArrayList<Mail> mails) {
		Iterator itr = mails.iterator();
		System.out.format("%-15s %-15s %-15s %-20s %-20s %-15s %s\n", "Id", "From", "To", "Subject", "Content",
				"Receiveddate", "Size");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		while (itr.hasNext()) {
			Mail mail = (Mail) itr.next();
			System.out.format("%-15s %-15s %-15s %-20s %-20s %-15s %s\n", mail.getId(), mail.getFrom(), mail.getTo(),
					mail.getSubject(), mail.getContent(), formatter.format(mail.getRecievedDate()), mail.getSize());
		}

	}

	public static void main(String[] args) throws NumberFormatException, ParseException {
		ArrayList<Mail> mails = new ArrayList<Mail>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of mails:");
		int num = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < num; i++) {
			String in = scanner.nextLine();
			String[] inLine = in.split(",");
			Mail mail = Mail.createMail(inLine);
			mails.add(mail);
		}
		System.out.println("Enter a type to sort:\r\n" + "1.Sort by from address\r\n" + "2.Sort by date received\r\n"
				+ "3.Sort by size\r\n" + "");
		int key = scanner.nextInt();
		switch (key) {
		case 1: {
			Collections.sort(mails);
			displayMails(mails);
			break;

		}
		case 2: {
			Collections.sort(mails, new DateComparator());
			displayMails(mails);
			break;

		}
		case 3: {
			Collections.sort(mails, new SizeComparator());
			displayMails(mails);
			break;

		}
		default: {
			scanner.close();
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

		}
		scanner.close();

	}

}
