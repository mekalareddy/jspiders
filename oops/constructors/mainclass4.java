class circle
{
	double r;
	double pi=3.14;
	circle(double arg)
	{
		r=arg;
	}
	void area()
	{	  
		System.out.println("area of circle is"+ pi*r*r);
	}
	void circumference()
	{ 
		System.out.println("circumference of circle is"+ pi*r*2);
	}
}
class mainclass4
{
	public  static void main(String[] args)
	{
		circle d1= new circle(2);
		d1.area();
		d1.circumference();
		circle d2= new circle(5);
		d2.area();
		d2.circumference();
	}
}