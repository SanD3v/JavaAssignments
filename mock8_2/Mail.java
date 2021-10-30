package mock8_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mail {

	public Mail() {

	}

	public Mail(Long id, String from, String to, String subject, String content, Date recievedDate, Double size) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.content = content;
		this.recievedDate = recievedDate;
		this.size = size;
	}

	public static Mail createMail(String[] in) throws NumberFormatException, ParseException {
//		String[] in = detail.split(".");
		Mail mail = new Mail(Long.valueOf(in[0]), in[1], in[2], in[3], in[4],
				new SimpleDateFormat("dd-MM-yyyy").parse(in[5]), Double.valueOf(in[6]));
		return mail;

	}

	private Long id;
	private String from;
	private String to;
	private String subject;
	private String content;
	private Date recievedDate;
	private Double size;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRecievedDate() {
		return recievedDate;
	}

	public void setRecievedDate(Date recievedDate) {
		this.recievedDate = recievedDate;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

}
