package com.nonPrimitiveArray;


public class Song {
	String name;
	String singer;
	Song(String name,String singer)
	{
		this.name=name;
		this.singer=singer;
	}
	void type(String type)
	{
		System.out.println("the type of the song is " + type);
	}

	public static void main(String[] args) {
		Song a=new Song("Closer","Ed Sheeran");
		Song b=new Song("I'm the one","DJ Khaleed");
		Song c=new Song("Hello","JLo");
		Song d=new Song("Wolves","Selena gomez");
		Song playlist[]={a,b,c,d};
		for(Song z:playlist)
		{
			System.out.println("Song: "+z.name);
			System.out.println("Singer:"+z.singer);
			z.type("Love");
		}

	}

}
