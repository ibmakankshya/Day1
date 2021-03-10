
public class StringDemo {
	public static void main(String[] args) {
		usingStringPool();
		withoutStringPool();
		withStringBuilder();
		dataManipulation();
	}

	private static void dataManipulation() {
		String s1 = new String("IBM");
		s1 =s1.concat("hi");
		String s2 = "IBM";
		
	}

	private static void withStringBuilder() {
		StringBuilder s1= new StringBuilder("IBM");
		StringBuilder s2= new StringBuilder("IBM");//heap
		System.out.println(s1==s2);
		
	}

	private static void withoutStringPool() {///heap
		String s1 = new String("IBM");
		String s2 = "IBM";
		
	}

	private static void usingStringPool() {//string pool
		String s1 = "IBM";
		String s2 = "IBM";
		
		
	}

}
