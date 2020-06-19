class triangle
{
	int s1;
	int s2;
	int s3;
	int base;
	int height;
	triangle(int arg1,int arg2,int arg3,int arg4,int arg5)
	{
		s1=arg1;
		s2=arg2;
		s3=arg3;
		base=arg4;
		height=arg5;
	}
	void area()
	{
		System.out.println("area of triangle is"+(s1+s2+s3));
	}
	void perimeter()
	{
		System.out.println("circumference of triangle is"+((1.0)/(2.0)*base*height));
	}
}
class mainclass6
{
	public static void main(String[] args)
	{
		triangle d1=new triangle(1,2,3,4,5);
		d1.area();
		d1.perimeter();
		triangle d2=new triangle(5,4,3,2,1);
		d2.area();
		d2.perimeter();
	}
}