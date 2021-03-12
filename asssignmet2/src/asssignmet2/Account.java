package asssignmet2;

public class Account {
	private String name;
	private long balance;
	
	public Account(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return ("Account Name:"+this.name +"  " +"Balance:"+ this.balance);//to print both in class
}
	

}
