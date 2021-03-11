package Array;

public class FinalKeyWord {
	public static void main(String[] args) {
		KibaKibi mane = new Kiba();
		mane.m1();
	}

}
 // class can be final
 class KibaKibi{
	 private final int fotua=5;
	//final metods cannot be ovverriden
	void m1() {
		 System.out.println("Kiba kii");
	 }
	public int getFotua() {
		return fotua;
	}
	void m2(){}
 }
 class Kiba extends KibaKibi{
	 
	 void m1() {
		 System.out.println("Dhei ki mane");
	 }
	 //if we want to ovveride @ovverride
	 @Override
	 void m2(){
		 System.out.println("waah");
	 }
 }