package dataConversion;

public class Teacher extends Human{
	
	private String subject;//mutable
	private float Salary;//mutable
	void teach() {}
	void takeAttendance() {}
	Teacher(){};
	Teacher(String name, float Salary,String subject, byte age){
		setName(name);
		setSalary(Salary);
		setSubject(subject);
		setAge(age);
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float Salary) {
		this.Salary = Salary;
	}
	
}
