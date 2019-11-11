package com.nonPrimitiveArray;

public class BookStore {

	public static void main(String[] args) 
	{
		Book a=new Book("ABC",100,001);
		Book b=new Book("DEF",200,002);
		Book c=new Book("GHI",300,003);
		Book d=new Book("JKL",400,004);
		Book e=new Book("MNO",500,005);
		Book bookShelf[]= {a,b,c,d,e};
		for(int i=0;i<bookShelf.length;i++)
		{
			System.out.println(bookShelf[i].name);
			System.out.println(bookShelf[i].price);
			System.out.println(bookShelf[i].isbn);
			bookShelf[i].genre("thriller");
			System.out.println("**************************");
		}
		for(Book z:bookShelf)
		{
			System.out.println("Name: "+ z.name);
			System.out.println("Price: "+ z.price);
			System.out.println("Isbn: "+ z.isbn);
			z.genre("Rap");
			System.out.println("**************************");
		}
	}
}
