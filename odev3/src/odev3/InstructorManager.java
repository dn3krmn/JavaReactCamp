package odev3;

public class InstructorManager {
	
	public void listCourse(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " " 
				+ instructor.getLastName() + " eğitmeninin kursları: ");
		
		for (String courses : instructor.getCourses()) {
			System.out.println(courses);
		}		
		System.out.println("########################");
	}

}
