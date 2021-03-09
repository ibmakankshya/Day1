
public class Human {
	private String name;// Data Encapsulation
	private byte age; //8bits=127max
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name== null || name.trim().equals(""))
		{
			throw new IllegalArgumentException("Name is mandatory");
		}
		this.name = name;
	}
	public int geAge() {
		return age;
	}


	
	public void setAge(byte age) {
		
		this.age = age;
	}
}
