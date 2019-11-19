package com.arrayList;
import java.util.ArrayList;

public class A 
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println(a.isEmpty());
		a.add(10);
		a.add("A");
		a.add(20);
		System.out.println(a);
		System.out.println(a.size());
		a.add(1, "C");
		System.out.println(a.set(2,"Z"));
		System.out.println(a.add(20));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.remove(1));
		System.out.println(a.contains("ABC"));
		System.out.println(a.add(10));
		System.out.println(a.contains(10));
		System.out.println(a.indexOf(10));
		System.out.println(a.lastIndexOf(10));
		System.out.println(a.isEmpty());
		System.out.println(a);
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
	}
}
