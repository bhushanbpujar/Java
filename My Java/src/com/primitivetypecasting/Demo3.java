package com.primitivetypecasting;

class Demo3 {
	public static void sum(int a, int b) {
		System.out.println(a+b); 

}
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c); 

}
	public static void sum(double a, double b) {
		System.out.println(a+b); 

}

	public static void main(String[] args) {
		sum(10,20);
		sum(10.5,20);
		sum(10,20,10);
	}
}
