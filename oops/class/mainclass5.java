class demo5
{	
	int s1;
	int s2;
	int s3;
	double height;
	double base;
	void disp()
	{
		System.out.println("area is"+(1.0/2.0)*base*height);
		System.out.println("circumference is"+(s1+s2+s3));
	}
}
class mainclass5
{	
	public static void main(String[] args)
	{
		demo5 d1= new demo5();
		d1.s1=4;
		d1.s2=4;
		d1.s3=4;
		d1.height=5;
		d1.base=d1.s3;
		d1.disp();
	}
}