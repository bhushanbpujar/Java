
public class Z 
	{
		int i=10;
		static int j=20;
		void M2(int i,int j)
		{
			this.i=i;
			Z.j=j;
			System.out.println(i);
			System.out.println(j);
		}
		static void M1(int i,int j,Z w)
		{
			w.i=i;
			Z.j=j;
			System.out.println(i);
			System.out.println(j);
		}

	public static void main(String[] args) 
	{
		Z w=new Z();
		w.M2(1,2);
		w.i=100;
		Z.j=200;
		System.out.println(w.i);
		System.out.println(j);
		Z.j=200;
		w.i=300;
		System.out.println(w.i);
		System.out.println(j);
		M1(0,0,w);

	}

}
