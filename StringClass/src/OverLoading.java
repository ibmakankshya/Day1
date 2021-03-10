import java.util.logging.Logger;
public class OverLoading {
	public static void main(String[] args) {
		Stud a = new Stud();
		a.study();
		a.study(1);
	}
}
//oveloading. same method different arguments
class Stud{

	public void study() {
		System.out.println("Porhisone?");
		
	}

	public void study(int i) {
		
		System.out.println("Porh marim" + i + "bar");
	}
	
}