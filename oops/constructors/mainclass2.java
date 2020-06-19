class demo1
{
	int x;
	double y;
	demo1()
	{
		x=10;
		y=4.24;	
	}
}
class mainclass2
{
	public  static void main(String[] args)
	{
		demo1 d1=new demo1();
		System.out.println(d1.x);
		System.out.println(d1.y);
		demo1 d2=new demo1();
		System.out.println(d2.x);
		System.out.println(d2.y);
	}
}