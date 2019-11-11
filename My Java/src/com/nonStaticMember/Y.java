package com.nonStaticMember;

public class Y {

	public static void main(String[] args) {
	 int n=564564434;
	 int temp=n;
	 int count=0;
	 while(temp!=0)
	 {
		 count++;
		 temp=temp/10;
	 }
	 System.out.println(count);
	 int a[]=new int[count];
	 for(int i=0;i<count;i++)
	 {
		 a[i]=n%10;
		 n=n/10;
	 }
	 for(int i=count-1;i>=0;i--)
	 {
		 System.out.print(a[i]);
	 }
	}

}
