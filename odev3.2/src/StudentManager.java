
public class StudentManager extends UserManager {

	public void logIn(Student student) {
		System.out.println("Ogrenci kaydoldu : " + student.getFirstName());
	}
}
