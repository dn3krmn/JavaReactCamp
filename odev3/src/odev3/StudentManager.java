package odev3;

public class StudentManager {


	public void ListCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName()
				+ " öğrencinin aldığı kurslar: ");
		for (String courses : student.getEnrolledCourses()) {
			System.out.println(courses);
		}
		System.out.println("########################");
	}
}
