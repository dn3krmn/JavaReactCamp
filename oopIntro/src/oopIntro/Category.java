package oopIntro;

public class Category {

	private int id;
	private String name;
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/* void ben bir şey yapmayacağım ben sadece bir şey yapacağım demek*/
	
	public String getName() {
		return name + "!"; //okunurken hepsinin sonunda ünlem olsun diye
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
