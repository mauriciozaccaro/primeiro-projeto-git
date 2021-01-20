package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH/mm/ss");
	
	private String nameClient;
	private String emailClient;
	private Date brithDate;
	
	public Client() {
		
	}
	
	public Client(String nameC, String emailC, Date dataC) {
		this.nameClient = nameC;
		this.emailClient = emailC;
		this.brithDate = dataC;
	}
	
	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public Date getBrithDate() {
		return brithDate;
	}
	
	
}
