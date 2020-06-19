class Student
{
	int roll_no=100;
	float marks=65.8f;
	String name="abcd";
	static String College_Name="ITM";
}
class StaticDemo
{
	public static void main(String args[])
	{
		Student s1=new Student();
		System.out.println(s1.roll_no);
		System.out.println(s1.marks);
		System.out.println(s1.name);
		System.out.println(Student.College_Name); 
		//or System.out.println(s1. College_Name); but first is use in real time.
		s1.roll_no=200;
		s1.marks=75.8f;
		s1.name="zyx";
		System.out.println(s1.roll_no);
		System.out.println(s1.marks);
		System.out.println(s1.name);
		Student  s2=new  Student();
		System.out.println(s2.roll_no);
		System.out.println(s2.marks);
		System.out.println(s2.name);
		System.out.println(Student.College_Name); 
	}
}