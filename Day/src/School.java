

public class School {
	public static void main(String[] args) {
		System.out.println("IBM");
		Student student1 = new Student("Hiya",(byte) 23);
		//student1.setName("Hiya Bhatta");//avoid
		//student1.name= "Hiya"; //avoid
		System.out.println(student1.getName());
		System.out.println(student1.geAge());
		student1.study();
		
		Teacher teacher = new Teacher("Zabin", 330,"English", (byte) 25 );
		printPattern();
		//Teacher teacher[i];
	/*	for(int i=0; i<10;i++) {
			Teacher teacher = new Teacher();
		
			System.out.println(i);
		}*/
		System.out.println(teacher.getName());
	}

	private static void printPattern() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
