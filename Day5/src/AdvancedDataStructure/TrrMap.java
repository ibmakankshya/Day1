package AdvancedDataStructure;
import java.util.Map;
import java.util.TreeMap;
public class TrrMap {
		public static void main(String[] args) {
			Map<String, String> accounts = new TreeMap<String, String>();
			accounts.put("1", "account1");
			accounts.put("2", "account2");
			System.out.println(accounts);
		}
}
