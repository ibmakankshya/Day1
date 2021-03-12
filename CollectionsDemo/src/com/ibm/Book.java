package com.ibm;
public class Book {
	
		private String title;
		private float price;

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public Book(String title) {
		this.title=title;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title)  {
			this.title = title;
			
		} 
		@Override
		public String toString() {
			return ("Name:"+this.title +"  " +"Price:"+ this.price);//to print both in class
	}
}
