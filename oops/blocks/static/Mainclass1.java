class demo1
{
	static int x; 	
	static double k;
	static
	{
		System.out.println("executing static block");
		x=30;
		k=24.4;
	}
	static void test1()
	{	   
		System.out.println("executing test1() 0f demo1 class");
	}
}
public class Mainclass1
{
	public  static void main(String[] args)
	{
		System.out.println("executing main() of main method class");
		demo1.test1();
		System.out.println("value of x is"+demo1.x);
		System.out.println("value of k is"+demo1.k);
	}
}