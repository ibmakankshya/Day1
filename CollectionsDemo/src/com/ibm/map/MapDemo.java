package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import java.util.Map;

import com.ibm.Book;
public class MapDemo {
	public static void main(String[] args) {
		createmapofbooks();
	}

	private static void createmapofbooks() {
		Map<String, Book> books = new HashMap<String, Book>(); //ey should be unique
		System.out.println(books.size());
		Book book1 = new Book("Kava");
		books.put("book1", book1);
		//System.out.println(books.size());//entry +keyvalue
		//Book[] book = new Book[10];
		for(int i =0; i<10;i++) {
		//	Book a = new Book("Ram"+i);
			
			books.put("book"+i, book1);
		}
		//books.clear()//empty all
		books.remove("book9");
		if(books.containsKey("book7")) {
			System.out.println("true");
		};
		System.out.println(books.size());
	}

}
