class demo1
{
	int x=10;
}
class demo2 extends demo1
{
	int x=100;
	void display()
	{
		int x=1000;
		System.out.println("x value  is"+x);
		System.out.println("x value  is"+this.x);
		System.out.println("x value  is"+super.x);
	}
}
class Dddd
{
	public static void main(String[] args)
	{
		demo2 d1=new demo2();
		d1.display();
	}
}