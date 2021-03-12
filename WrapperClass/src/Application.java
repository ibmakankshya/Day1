
public class Application {

	public static void main(String[] args) {
		int a=1;//primitive
		int c=3;
		Integer b=a;//autoboxing
		Integer d = c;
		float f= 34.98F;
		Double d1 = 34.0;
		System.out.println(d1.compareTo(89.00));
		double primitiveDouble =d1; // autounboxing
		//List<int> not allowed so wrapper classes introduce
		System.out.println(d1);
	}

}
