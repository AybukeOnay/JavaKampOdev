
public class Student extends User {
	
	private int userId;
	private String firstName;
	private String lastName;
	
	public Student() {
		
	}

	public Student(int userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
