package Array;

public class VarangsDemo {
		public static void main(String[] args) {
			
			int result = add("Alaka", 1,2,3,6,5,4,7,8,9);
			System.out.println(result);
			
		}

		private static int add(String name, int...numbers) {// inside main method always static methods
			int addition=0;
			for(int i=0; i <numbers.length;i++) {
				addition= numbers[i]+addition;
				}
			System.out.println(numbers[5]);
			System.out.println(name);
			return addition;
			
		}
		static boolean bol(boolean...bs) {
			return false;
			
		}
}



class Book{
	String genre;
	Author[] authors ;
	Book(){
		Author[] authors=new Author[3];//best practices
	}
	class Author{
		private String name;
		private String email;
	}
	
}