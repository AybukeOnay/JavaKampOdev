
public class Instructor extends User {

	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	
	public Instructor() {
		
	}

	public Instructor(int id, int userId, String firstName, String lastName) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
