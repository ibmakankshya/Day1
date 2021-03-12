package com.ibm.set;

import java.util.HashSet;
import java.util.Set;

import com.ibm.Book;
//import java.awt.print.Book;
public class SetDemo {
	public static void main(String[] args) {
		createBook();
	}

	private static void createBook() {
		Set<Book> books = new HashSet<Book>();//cntrl+shift+o
		for(int i =0 ; i<70;i++) {
			Book book = new Book("Title "+i);
			book.setPrice(100+i);
			books.add(book);
		}
		System.out.println(books);
	}
}
