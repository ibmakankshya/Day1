package presentation;

public class StaticMain {
	
	//static block
	static {System.out.println("Before Main");}
	public static void main(String[] args) {
		Student S1 = new Student(13, "Hiya");
		Student S2 = new Student(1100, "Pratik");
		S1.display();
		S2.display();
		S1.displayi();
	
	}
}

	
