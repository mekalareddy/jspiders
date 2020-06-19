class demo6
{	
	double r;
	static final double pi=3.14;
	void circlearea()
	{
		System.out.println("area is"+pi*r*r);
	}
	void circlecircumference()
	{
		System.out.println("circumference is"+2*pi*r);
	}
}
class mainclass6
{	
	public static void main(String[] args)
	{
		demo6 d1= new demo6();
		d1.r=4;
		d1.circlearea();
		d1.circlecircumference();
		d1.r=5;
		d1.circlearea();
		d1.circlecircumference();
	}
}