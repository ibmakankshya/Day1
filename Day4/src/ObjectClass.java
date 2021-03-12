
public class ObjectClass {

	public static void main(String[] args) {
			
			A b = new A();
			System.out.println(b);//by default object class is implicit calls tostring itself!
			try {
				b.setTitle(null);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println(b.toString());
			A b1 = new A();
			//b1.setTitle("Bhandari");
			System.out.println(b1);//because of toString override this gets printed.
			
	}

}
class A {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		this.title = title;
		if(title==null) {
			throw new Exception();												//IllegalArgumentException();//exception
		}
	} 
	@Override
	public String toString() {
		return this.title;
	}
}