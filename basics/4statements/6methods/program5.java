class program5
{
	static void area(int r)
	{
		System.out.println("calculating area of circle");
		final  double pi=3.14;
		double area=pi*r*r;
		System.out.println("area is"+area);
	}
	static void circumference(int r)
	{
		System.out.println("calculating circumference of circle");
		final double pi=3.14;
		double circumference =2*pi*r;
		System.out.println("circumference is"+circumference);
	}  
	public static void main(String[] args)
	{
		System.out.println("execution started");
		area(3); 
		circumference(3);
		System.out.println("execution ended");
	}   
}
