package com.ibm;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
	
			//demo1();
			bookList();
	}

	private static void bookList() {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("Roches");
		book1.setPrice(100.7f);
		books.add(book1);
		Book book2 = new Book("Sarabhai");
		book1.setPrice(8.7f);
		books.add(book2);
		Book book3 = new Book("Maya");
		book3.setPrice(90);
		books.add(book3);
		System.out.println(books);
		//books.remove(0);
		//System.out.println(books.getPrice());
		books.add(new Book("Learn Love"));
		Iterator<Book> it = books.iterator();
		//while(it.hasNext()) {
		//	Book book = it.next();
		//	if(book.getTitle().contains("Learn")) {
			//System.out.println(book);
			//	}
		books.sort(new Comparator<Book>(){
		@Override
		public int compare(Book book1 , Book book2) {//callback
			return (int)(book2.getPrice()- book1.getPrice());//sorted ((2-1 : decending) 1-2 : ascending
		}
		});
		System.out.println("after sorthing:" + books);
		}
		
		//switch cases
	/*	switch(((Book) books).getTitle()) {
		case "Akn":
			System.out.println("From switch!");
			break;
		default:
			System.out.println("Leh!");
			break;//break needs to be put
		}*/
		
	

	private static void demo1() {
//		List list = new ArrayList();
			List<Integer> list = new ArrayList<Integer>();// generic
			list.add(1);
			list.add(3);
			System.out.println(list);
			list.remove(2); // 2 represents index
			list.contains(1); //check wheteer it has 1
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				System.out.println(integer);
			}
			//(Iterator iterator = list.iterator());
		
	}

}
