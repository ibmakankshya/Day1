import java.util.logging.Logger;
public class StaticKeyword {
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		s1.setCount(2);
		s2.setCount(5);
		System.out.println(s1.getCount());
		System.out.println(s2.getCount());
		Student.study();
	}
}
 class Student{
	 static Logger logger = Logger.getLogger(Student.class.toString());
	 private static int count;

	public int getCount() {
		logger.warning("bhut");
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public static void study() {
		System.out.println("Study o");
	}
	 
 }