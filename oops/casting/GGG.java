class x
{
	private void wish()
	{
		System.out.println("hi....");
	}
}
class y extends x
{
	private void wish()
	{
		System.out.println("bye....");
	}
}
class GGG
{
	public static void main(String[] args)
	{
		x X1=new y();
		X1.wish();
	}
}
