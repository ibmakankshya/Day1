package dataConversion;

public class Student extends Human {
	
	void eat() {
		super.eat();
		//System.out.println("Student eats");//overrides
	}
	
	private String name;
	Student(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
