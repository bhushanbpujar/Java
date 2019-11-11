package com.nonPrimitiveArray;

public class Book
	{
		String name;
		int price;
		int isbn;
		Book(String name, int price, int isbn)
		{
			this.name=name;
			this.price=price;
			this.isbn=isbn;
		}
		void genre(String genre) 
		{
			System.out.println("the book "+ name + " of price " + price +  " and isbn " + isbn + " is of genre "+ genre );
			
		}
}