package odev3;

public class Main {

	public static void main(String[] args) {
		
		String[] courses = {"C#", "JAVA", "PYTHON"};
		
		Instructor instructor = new Instructor();
		Student student = new Student();
		
		//Adding Instructor
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("ed@gmail.com");
		instructor.setPassword("1234");
		instructor.setCourses(courses);
		
		//Adding Student
		student.setId(2);
		student.setFirstName("Döne");
		student.setLastName("Karaman");
		student.setEmail("dk@gmail.com");
		student.setPassword("dkdkdk");
		student.setEnrolledCourses(new String[] {courses[1]});
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.add(instructor);		
		userManager.add(student);
		
		instructorManager.listCourse(instructor);
		studentManager.ListCourse(student);
	}

}
