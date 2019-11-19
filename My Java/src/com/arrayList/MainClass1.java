package com.arrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
public class MainClass1 {
	public static void main(String[] args) {
		ArrayList<Emp> a=new ArrayList();
		Emp e1=new TestEng(5, "T5");
		Emp e2=new Dev(3, "D3");
		Emp e3=new TestEng(1, "T1");
		Emp e4=new Dev(4, "D4");
		Emp e6=new Dev(6, "D6");
		Emp e5=new TestEng(2, "T2");
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		a.add(e6);
		System.out.println(a);
		System.out.println("___________________________________________________________-");
		Collections.sort(a);
		System.out.println(a);
		System.out.println("___________________________________________________________-");
		Iterator<Emp> q=a.iterator();
		for(int i=0;i<a.size();i++)
		{
			Object w=a.get(i);
			System.out.println(w);
		}
		System.out.println("__________________________________________________");
		for(Object z:a)
			
		{
			if(z instanceof TestEng)
			{
				System.out.println(((TestEng)z).id);
				System.out.println(((TestEng)z).name);
			}
			if(z instanceof Dev)
			{
				System.out.println(((Dev)z).id);
				System.out.println(((Dev)z).name);
			}
		}
		System.out.println("___________________________________________________________-");
		while(q.hasNext())
		{
			System.out.println(q.next());
			System.out.println(q.next());
		}
		
	}

}
