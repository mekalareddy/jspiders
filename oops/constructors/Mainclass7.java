class demo4
{
	int x; 	
	double y;
	demo4()
	{
		System.out.println("running noarg constructor");
	}
	demo4(int arg)
	{	   
		System.out.println("running int arg constructor");
		x=arg;
	}
	demo4(double arg)
	{	   
		System.out.println("running double arg constructor");
		y=arg;
	}
}
public class Mainclass7
{
	public  static void main(String[] args)
	{
		demo4 d1=new demo4();
		System.out.println("value of x is"+d1.x);
		System.out.println("value of k is"+d1.y);
		demo4 d2=new demo4(10);
		System.out.println("value of x is"+d2.x);
		System.out.println("value of k is"+d2.y);
		demo4 d3=new demo4(42.4);
		System.out.println("value of x is"+d3.x);
		System.out.println("value of k is"+d3.y);
	}
}