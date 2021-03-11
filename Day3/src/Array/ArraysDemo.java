package Array;

public class ArraysDemo {
	public static void main(String[] args) {
		//int[] scores = new int[10];
		//int i;
		//for(i=0; i<scores.length;i++) {
			//System.out.println(scores[i]);
		//}
		/*int[] numbers= {1,2345};
		for(i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		boolean[] booleans = {true , true};
			for(boolean value : booleans) {
				System.out.println(booleans);
			}
		String[] names = new String[10];//create an array of capacity 10, no string objects created here
		for(String name : names) {
			name= new String ("Ram");//goes to heap
			name= "Ram";//string pool only 1 object
			System.out.println(name);
		}*/
		But[] b = new But[10];//creates 10 objects
		for(int i=0; i<b.length;i++) {
			But a = new But("Ras"+i);
			b[i]= a;
			if(i==5)
			break;
			//System.out.println(a.getName());
			
		}
		for(int i=0; i<b.length;i++) {
			
			System.out.println(b[i].getName());
		}
	}

}
class But{
	private String name;
	But(String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}