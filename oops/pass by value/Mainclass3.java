class student
{
	int id;
	String name;
	student(int arg1,String arg2)
	{
		id=arg1;
		name=arg2;
	}
}
class officeboy
{
	void displayonnoticeboard(student arg)
	{
		System.out.println(arg.name+"\t"+arg.id);
		System.out.println("contact hod immeadiately");
	}
}
class hod
{
	void callofficeboy()
	{
		officeboy o1=new officeboy();
		student st=new student(12345,"gova");
		o1.displayonnoticeboard(st);
	}
}
class Mainclass3
{
	public static void main(String[] args)
	{
		hod s1=new hod();
		s1.callofficeboy();
	}
}