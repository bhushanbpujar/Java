package com.staticMember;

public class Marker {
		static int price;
		static String color;
		static void writing()
		{
			System.out.println("Marker of color " + color + " is writing" + " and price is " + price);
		
		}

		public static void main(String[] args)
		{
			System.out.println(Marker.price);
			System.out.println(Marker.color);
			Marker.price=100;
			Marker.color="black"; 
			Marker.price=10;     // the previous data in the PRICE will me replaced since only one instance
			Marker.color="blue"; // // the previous data in the COLOR will me replaced since only one instance
			System.out.println("Marker of color " + color + " is writing" + " and price is " + price);
			System.out.println("Marker of color " + color + " is writing" + " and price is " + price);
			writing();
		}
}
