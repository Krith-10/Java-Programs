package MiniCapstone.EmailApplication;

import java.util.Scanner;

public class EmailGen {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int passwordLen = 10;
	private String team;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	
	public EmailGen(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
		this.team = setTeam();
		this.password = randPassword(passwordLen);
		this.email = setEmail();
	}
	
	private String setTeam() {
		System.out.println("Enter the team\n1)Sales\n2)Accounting\n3)Development\n0)None");
		Scanner in = new Scanner(System.in);
		int teamChoice = in.nextInt();
		if (teamChoice == 1) {
			return "Sales";
		}
		else if (teamChoice == 2) {
			return "Accounting";
		}
		else if(teamChoice == 3) {
			return "Development";
		}
		else {
			return "";
		}
	}
	
	private String randPassword(int length) {
		String passcode = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$&";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passcode.length());
			password[i] = passcode.charAt(rand);
		}
		return String.valueOf(password);
	}
	
	private String setEmail() {
		return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"_"+this.team.toLowerCase()+"@xyz.com";
	}
	
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}
	

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public String getAlternateEmail () {
		return this.alternateEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}

	public String showInfo() {
		return "Name :"+this.firstName+" "+this.lastName+
				"\nCompany Email:"+this.email+
				"\nPassword:"+this.password;
	}
	
	
}
