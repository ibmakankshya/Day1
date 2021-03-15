package ll;
import java.util.Comparator;
//import java.util.LinkedList;
import java.util.List;
public class LinkedList {
	public static void main(String[] args) {
	List<String> names = (List<String>) new LinkedList();
		for(int i =0; i< 500; i ++)
		{
			names.add("Warsi"+i);
		}
		System.out.println(names);

  names.sort(new Comparator<String>() {
	  public int compare(String o1, String o2) {
		  int a = Integer.valueOf(o2.substring(3));
		  int a1 = Integer.valueOf(o2.substring(3));
		  return a1- a;
	  }
  });
  System.out.println(names);
	}}