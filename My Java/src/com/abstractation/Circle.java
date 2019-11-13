package com.abstractation;

public class Circle extends Shape{
	int radius;
	Circle(){
		
	}
	Circle(int radius)
	{
		this.radius=radius;
	}
	double area()
	{
		return(PI*this.radius*this.radius);
	}

}
