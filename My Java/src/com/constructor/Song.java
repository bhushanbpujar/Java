package com.constructor;

public class Song {
	String name;
	String singer;
	Song(String name,String singer)
	{
		this.name=name;
		this.singer=singer;
		System.out.println("Name: "+ name);
		System.out.println(" Singer " + singer);
	}

	public static void main(String[] args) {
		Song a=new Song("Closer","Ed Sheeran");
		Song b=new Song("I'm the one","DJ Khaleed");

	}

}
