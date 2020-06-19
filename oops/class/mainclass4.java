class demo4
{	
	String name;
	double fee ;
	long phno;
	void disp()
	{
		System.out.println("student name is"+name);
		System.out.println("student fee is"+fee);
		System.out.println("student idno is"+phno);
	}
}
class mainclass4
{	
	public static void main(String[] args)
	{
		demo4 d1= new demo4();
		d1.name="gova";
		d1.fee=4.24;
		d1.phno=1234567890l;
		d1.disp();
	}
}