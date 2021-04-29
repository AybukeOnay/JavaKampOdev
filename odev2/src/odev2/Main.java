package odev2;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id=1;
		course1.name="C#";
		course1.educator="Engin Demiroğ";
		course1.description="Bu eğitimde C# ile proje geliştireceğiz";
		
		Course course2 = new Course(2,"Java","Engin Demiroğ","Bu eğitimde java "
				+ "ile program geliştireceğiz");
		
		Course courses[]= {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
			System.out.println(course.description);
		}
		
	

	}

}
