package odev2;

public class Student {
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String password, String eMail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.eMail = eMail;
	}
	int id;
	String firstName;
	String lastName;
	String password;
	String eMail;
}
