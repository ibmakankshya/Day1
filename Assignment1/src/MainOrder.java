



public class MainOrder {
		public static void main(String[] args) {
			Item a1 = new Item("Philips Hair straightner", 2300);
			CustomerAdress a2 = new CustomerAdress("Baker's Street", 12345);
			a2.status(1);
			System.out.println(a1.getCost());
		}
}
