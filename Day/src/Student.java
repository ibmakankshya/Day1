
public class Student  extends Human {
	
	
	
	void study() {
		System.out.println(this.getName()+" is studying");
	}
	Student(String name, byte age){
	setName(name);
	setAge(age); //custom constructor
	}
	
}

