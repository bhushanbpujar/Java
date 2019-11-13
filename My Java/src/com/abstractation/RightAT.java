package com.abstractation;

public class RightAT extends Shape
{
	int base;
	int height;
	RightAT(){
		
	}
    RightAT(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	double area() {
		return(this.height*this.base*0.5);
	}
	
}
