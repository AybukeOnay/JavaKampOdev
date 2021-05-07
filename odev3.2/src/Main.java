
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Aybuke","Onay");
		Instructor instructor = new Instructor();
		
		UserManager userManager = new UserManager();
		userManager.add(student);

	}

}
