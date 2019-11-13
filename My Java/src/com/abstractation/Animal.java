package com.abstractation;

abstract public class Animal {
double height;
double weight;
Animal(){
	
}
Animal(double height,double weight)
{
	this.height=height;
	this.weight=weight;
	System.out.println(this.height);
	System.out.println(this.weight);
	
}
abstract void talk();
}
