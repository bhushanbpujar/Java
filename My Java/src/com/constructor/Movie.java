package com.constructor;

public class Movie {
	String name;
	int YOR;
	double rating;
	Movie(String name,int YOR,double rating )
	{
		this.name=name;
		this.YOR=YOR;
		this.rating=rating;
		System.out.println("Name: "+ name + " YOR " + YOR + " Rating " + rating);
		
	}
}

