package asssignmet2;
import java.util.ArrayList;
import java.util.List;



public class FinalAccount {

	public static void main(String[] args) {
		Account[] baccounts = new Account[10];//objects of array
		List<Account> accounts = new ArrayList<Account>();//list of accounts
		//Account ac1 = new Account("ninu");
		//ac1.setBalance(9000);
		//accounts.add(ac1);
		//System.out.println(accounts);
		for (int i = 0; i < 10; i++) {
			accounts.add(baccounts[i]);
			System.out.println(accounts);
		}
	}

}
