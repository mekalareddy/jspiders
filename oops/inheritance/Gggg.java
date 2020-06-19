class Sample2
{
	Sample2()
	{
		System.out.println("running sample2 constructor"); 
	}
}
class Sample3 extends Sample2
{
	Sample3(int arg)
	{
		System.out.println("running sample3 constructor");
		System.out.println("arg value is"+arg);
	}
}
class Sample4 extends Sample3
{
	Sample4()
	{
		super(14);
		System.out.println("running sample3 constructor");
	}
}
class Gggg
{
	public static void main(String[] args)
	{
		Sample4 s1=new Sample4();
	} 
}  