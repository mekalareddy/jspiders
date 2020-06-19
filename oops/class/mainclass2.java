class demo2
{	
	int a=10;
	double b=1.2;
	void disp()
	{
		System.out.println("running test().....");
	}
}
class mainclass2
{	
	public static void main(String[] args)
	{
		demo2 d1= new demo2();
		System.out.println(d1.a); 
		System.out.println(d1.b);
		d1.disp();
		d1.a=4;
		d1.b=4.24;
		demo2 d2= new demo2();
		System.out.println(d1.a);
		System.out.println(d1.b);
	}
}