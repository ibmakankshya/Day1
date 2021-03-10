import java.util.Date;
public class dateClass {
	public static void main(String[] args) {
		Date date1 = new Date(2021, 1, 11);
		System.out.println(date1.getMonth());
		Date date2 = new Date(2020, 1, 11);
		Date date3 = new Date();
		System.out.println(date1 == date2);// reference
		System.out.println(date1.equals(date2));//data equality
		System.out.println(date1.equals(date3));//data equality
	}
}
