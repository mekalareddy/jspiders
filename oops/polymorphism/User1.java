class Atm
{
	public Cash withdraw()
	{
		Cash c1=new Cash();
		System.out.println("returning cash");
		return c1;
	}
}
class Cash
{
	public void buySomething()
	{
		System.out.println(100);
	}
}
class User1
{
	public static void main(String[] args)
	{
		Atm a1=new Atm();
		Cash c1=a1.withdraw();
		c1.buySomething();
	}
}
