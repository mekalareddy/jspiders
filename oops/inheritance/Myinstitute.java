import java.util.Scanner;
class Jspiders
{
	String course;
	int fee;
	Jspiders(String arg1,int arg2)
	{
		course=arg1;
		fee=arg2;
	}
	void dev()
	{
		System.out.println("Name of the Course is: "+course+".Fee is:"+fee);
	}
}
class Qspiders
{
	String course;
	int fee;
	Qspiders(String arg1,int arg2)
	{
		course=arg1;
		fee=arg2;
	}
	void tes()
	{
		System.out.println("Name of the Course is: "+course+".Fee is:"+fee);
	}

}
class branches
{
	String location; 
	long phno;
	branches[] bArr;
	branches(String arg1,long arg2)
	{
		location=arg1;
		phno=arg2;
		bArr=new branches[4];
		System.out.println("Welcome to "+location+" branch.Contact: "+phno);
	}
}
class faculty
{
	String name;
	int experience; 
	faculty[] fac;
	faculty(String arg1,int arg2)
	{
		name=arg1;
		experience=arg2;
		fac=new faculty[4];
		System.out.println("faculty name:"+name+".experience is:"+experience+"years.");	
	}
}
class Myinstitute
{
	public static void main(String[] args)
	{
		Jspiders jsp=new Jspiders("JAVA",19000);
		Qspiders qsp=new Qspiders("TESTING",22900);
		System.out.println("welcome to Java Training Institute,Banglore.");
		Scanner read=new Scanner(System.in);
		System.out.println("Press 1 to know branch locations and contacts");
		System.out.println("Press 2 to know course,faculty and fee details");
		int opt1=read.nextInt();
		if(opt1==1)
		{
			branches br1=new branches("BASAVANAGUDI",9999999999l);
			branches br2=new branches("RAJAJINAGAR",6666666666l);
			branches br3=new branches("OLD AIRPORT ROAD",9999999999l);
			branches br4=new branches("BANASWADI",6666666666l);
		}
		else if(opt1==2)
		{
			System.out.println("select course");
			System.out.println("Press 1 for JAVA");
			System.out.println("Press 2 for TESTING");
			int opt2=read.nextInt();
			switch(opt2)
			{
			case 1:jsp.dev();
			faculty fac1=new faculty("KESHAV",14);
			faculty fac2=new faculty("MADHU",5);
			faculty fac3=new faculty("RAGHU",10);
			faculty fac4=new faculty("KUMAR",10);
			break;
			case 2:qsp.tes();
			faculty fac5=new faculty("GIRI",14);
			faculty fac6=new faculty("RAGHU",10);
			faculty fac7=new faculty("KUMAR",10);
			break;	 
			}
		}
	}
}