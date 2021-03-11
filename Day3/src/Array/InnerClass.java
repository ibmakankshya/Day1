package Array;
//import Account.Address;

public class InnerClass {
	public static void main(String[] args) {
		Account[] acconts = new Account[10];
		
		for(int i=0; i<acconts.length;i++) {
			
			//System.out.println(acconts[i].getStreetName());
	}

}
class Account{//no extends so inheritance
	//private Address adress;//creates one address object only
	private Address[] addresses ; //creates many addresses reference no objects tilll now
	public Address[] getAddresses() {
		return addresses;
	}




	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}




	private int number;
	public int getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}




	public Account(Address[] addresses, int number) {
		
		this.addresses = new Address[3]; // delaying lazy initialization
		this.number = number;
	}
	
	
	
	
	private class Address{ //nested
		private String streetName;
	}
}}

	

	