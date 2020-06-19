class demo1
{
	int x;
	double y;
	demo1(int arg1,double arg2)
	{
		x=arg1;
		y=arg2;	
	}
}
class mainclass3
{
	public  static void main(String[] args)
	{
		demo1 d1=new demo1(10,4.24);
		System.out.println(d1.x);
		System.out.println(d1.y);
		demo1 d2=new demo1(1,42.4);
		System.out.println(d2.x);
		System.out.println(d2.y);
	}
}