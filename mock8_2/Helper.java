package mock8_2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
	public static void main(String[] args) throws NumberFormatException, ParseException {
		MailFolder mailFolder = new MailFolder();
		ArrayList<Mail> arrayList = new ArrayList<Mail>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the folder:");
		String name = scanner.next();
		boolean close = false;
		mailFolder.setName(name);
		mailFolder.setMailList(arrayList);
		while (!close) {
			System.out.println("1.Add Mail\r\n" + "2.Delete Mail\r\n" + "3.Display Mails\r\n" + "4.Exit\r\n" + "");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter the details of mail in CSV format:");
				String input = scanner.nextLine();
				String[] inLine = input.split(",");
				Mail mail = Mail.createMail(inLine);
				mailFolder.getMailList().add(mail);
				System.out.println("Mail successfully added");

				break;

			}
			case 2: {
				System.out.println("Enter the id of the mail to be deleted:");
				Long id = scanner.nextLong();
				if (mailFolder.removeMailFromFolder(id))
					System.out.println("Mail successfully deleted");
				else
					System.out.println("Mail not found in the folder");
				break;

			}
			case 3: {
				mailFolder.displayMails();
				break;

			}
			case 4: {
				close = true;
				break;

			}
			default: {
				scanner.close();
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

			}

		}
		scanner.close();
	}

}
