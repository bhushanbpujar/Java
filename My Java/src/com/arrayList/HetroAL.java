package com.arrayList;
import java.util.ArrayList;

public class HetroAL 
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(new Bike(50, "RED"));
		a.add(new Movie("La La Land",8.9));
		a.add(new Employee(1, "ABC"));
		a.add(10);
		//Displaying ArrayList elements:
		System.out.println(a);
		//Accessing each element using in built method that is GET()
		for(int i=0;i<a.size();i++)
		{
			Object z=a.get(i);
			if(z instanceof Bike)
			{
				System.out.println(((Bike)z).color); //z is a parent variable of Object Class. So, in order to access sub class elements we DOWNCAST
				System.out.println(((Bike)z).mil);
			}
			if(z instanceof Employee)
			{
				System.out.println(((Employee)z).id);
				System.out.println(((Employee)z).name);
			}
			System.out.println(z);           //Just displaying.
			if(z instanceof Integer)
			{
				System.out.println((z));
				// System.out.println(z+10);     // CTE because adding object and integer.
				Integer q= (Integer) z;          // DOWN CASTING FROM SUPER CLASS TO SUB CLASS.
				int w=(int)q;                    // Auto-UNBOXING.
				System.out.println(w+10);
		}
		
	}
	}
}
/*[Bike [mil=50, color=RED], Movie [name=La La Land, rating=8.9], Employee [id=1, name=ABC], 10]
RED
50
1
ABC
10
20
*/

