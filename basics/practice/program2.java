class program2
{
	static void acircle(double r,double pi)
	{
		System.out.println("calculating area of circle");
		double area=pi*r*r;
		System.out.println("area is"+area);
	}
	static void ccircle(double r,double pi)
	{
		System.out.println("calculating circumference of circle");
		double circumference =2*pi*r;
		System.out.println("circumference is"+circumference);
	}  
	public static void main(String[] args)
	{
		System.out.println("execution started");
		acircle(3,3.14);
		ccircle(3,3.14);
		System.out.println("execution ended");
	}   
}
