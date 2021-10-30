package mock8_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class MailFolder {

	public MailFolder() {
	}

	public MailFolder(String name, ArrayList<Mail> mailList) {
		super();
		this.name = name;
		this.mailList = mailList;
	}

	public void addMailToFolder(Mail mail) {
		this.getMailList().add(mail);

	}

	public Boolean removeMailFromFolder(Long id) {
		Iterator itr = this.getMailList().iterator();
		while (itr.hasNext()) {
			Mail mail = (Mail) itr.next();
			if (mail.getId() == id) {
				itr.remove();
				return true;
			}

		}
		return false;

	}

	public void displayMails() {
		if (this.getMailList().isEmpty()) {
			System.out.println("No mails to show");
			return;
		}
		System.out.println("Mails in Inbox");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		System.out.printf("%-10s%-15s%-15s%-15s%-20s%-15s%-10s\n", "Id", "From", "To", "Subject", "Content",
				"ReceivedDate", "Size");
		for (Mail mail : this.getMailList()) {
			System.out.printf("%-10s%-15s%-15s%-15s%-20s%-15s%-10s\n", mail.getId(), mail.getFrom(), mail.getTo(),
					mail.getSubject(), mail.getContent(), formatter.format(mail.getRecievedDate()), mail.getSize());

		}
	}

	private String name;
	private ArrayList<Mail> mailList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Mail> getMailList() {
		return mailList;
	}

	public void setMailList(ArrayList<Mail> mailList) {
		this.mailList = mailList;
	}

}
