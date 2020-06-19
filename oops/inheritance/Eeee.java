class Sample1
{
	Sample1()
	{
		this(50);
		System.out.println("running no arg constructor"); 
	}
	Sample1(int arg1,int arg2)
	{
		System.out.println("running int arg constructor");
		System.out.println("arg value is"+arg);
	}
}
class Eeee
{
	public static void main(String[] args)
	{
		Sample1 s1=new Sample1();
	}
}  