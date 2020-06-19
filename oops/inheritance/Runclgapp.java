import java.util.Scanner;
class student
{
	int no;
	int percentage;
	student(int arg1,int arg2)
	{
		no=arg1;
		percentage=arg2;
	} 
}
class faculty
{
	int id;
	String name;
	int exp;
	faculty(int arg1,String arg2,int arg3)
	{
		id=arg1;
		name=arg2;
		exp=arg3;
	}
}
class library
{
	String librarian;
	String type;
	library(String arg1,String arg2)
	{
		librarian=arg1;
		type=arg2;
	}
}
class department
{
	int id;
	String name;
	student[] stArr;
	static int index;
	department(int arg1,String arg2,int strength)
	{
		id=arg1;
		name=arg2;
		stArr=new student[strength];
	}
	void addstudent(student s1)
	{
		if(index<stArr.length)
		{
			stArr[index++]=s1;
			System.out.println("welcome to "+name+" depatment");
		}
		else
		{
			System.out.println("no admission,house full");
		}
	}
}
class college
{
	String name;
	college(String arg)
	{
		name=arg;
	}
	department csdept=new department(1102,"cs",987);
	department ecdept=new department(2202,"ec",487);
	department mechdept=new department(3302,"mech",837);
	library centlib=new library("jaya","central");
}
class Runclgapp
{
	public static void main(String[] args)
	{
		college jspcol=new college("GATES");
		System.out.println("welcome to GATES");
		jspcol.csdept.addstudent(new student(60,40));
		jspcol.ecdept.addstudent(new student(180,73));
		jspcol.mechdept.addstudent(new student(120,5));
		Scanner read=new Scanner(System.in);
		System.out.println("press 1 for new admission");
		System.out.println("press 2 for student record");
		int no=read.nextInt();
		if(no==1)
		{ 
			System.out.println("welcome to new admissions");
			System.out.println("press c for csdept admission");
			System.out.println("press e for ecdept admission");
			System.out.println("press m for mechdept admission");
			String alp=read.next();
			System.out.println("enter stuudent name");
			String name=read.next();
			System.out.println("enter ID number");
			long idno=read.nextInt();
		}
		else if(no==2)
		{
			System.out.println("welcome to student records");
			System.out.println("press C for csdept records");
			System.out.println("press E for ecdept records");
			System.out.println("press M for mechdept records");
			String alp=read.next();
			switch(alp)
			{
			case"c":
				System.out.println("No of students intake"+jspcol.csdept.stArr[0].no);
				System.out.println("pass percetage:"+jspcol.csdept.stArr[0].percentage);
				break;
			case"e":
				System.out.println("No of students intake:"+jspcol.ecdept.stArr[1].no);
				System.out.println("pass percetage:"+jspcol.ecdept.stArr[1].percentage);
				break;
			case"m":
				System.out.println("No of students intake:"+jspcol.mechdept.stArr[2].no);
				System.out.println("pass percetage:"+jspcol.mechdept.stArr[2].percentage);
				break;
			default:System.out.println("invalid entry");
			}
		}	
		else
		{	
			System.out.println("invalid entry"); 
		}

	}
}

