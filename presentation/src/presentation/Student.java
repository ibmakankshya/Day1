package presentation;

public class Student {
	private int roll;
	private String name;
	//static variables
	static String collegename = "IBM COLLEGE";
	
	//static method
	static void displayi() {
		collegename = "GRMS";
		System.out.println(collegename);
	}
	Student(int roll, String name){
		this.roll=roll;
		this.name=name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	void display() {
		System.out.println("College Name : "+ collegename +" Student's Name:" + name+ "," + "Roll no."+ roll );
	}

}
