class demo3
{	
	String name;
	double cost;
	String colour;
	void disp()
	{
		System.out.println("pen name is"+name);
		System.out.println("pen cost is"+cost);
		System.out.println("pen colour is"+colour);
	}
}
class mainclass3
{	
	public static void main(String[] args)
	{
		demo3 d1= new demo3();
		d1.name="elkos";
		d1.cost=4.24;
		d1.colour="green";
		d1.disp();
	}
}