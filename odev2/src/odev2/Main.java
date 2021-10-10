package odev2;

public class Main {

	public static void main(String[] args) {
		
		Register member = new Register("Döne", "Karaman", 
				"dk@gmail.com", "dkdkdk");
		
		
		Camp course1 = new Camp("JAVA+REACT", 
				"Yazılım Geliştiri Yetiştirme Kampı", "Engin Demiroğ");
		Camp course2 = new Camp("C#+ANGULAR", 
				"Yazılım Geliştiri Yetiştirme Kampı", "Engin Demiroğ");
		Camp course3 = new Camp("PYTHON", 
				"Programalamaya Giriş İçin Temel Kurs", "Engin Demiroğ");
		
		MemberManager manager = new MemberManager();
		manager.addToMember(member);
		
		CurseManager cManager = new CurseManager();
		cManager.addToCourse(course1);
		cManager.addToCourse(course2);
		cManager.addToCourse(course3);
		
	}

}
