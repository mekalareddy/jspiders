import java.util.Scanner;
class Engineers
{  
	String name;
	String branch1;
	String branch2;
	Engineers(String arg1,String arg2,String arg3)
	{
		name=arg1;
		branch1=arg2;
		branch2=arg3;
	}
}
class Outcomes
{
	String branch1;
	String branch2;
	String branch3;
	Outcomes(String arg1,String arg2,String arg3)
	{
		branch1=arg1;
		branch2=arg2;
		branch3=arg3;
	}
}
class Countries
{
	String loc1;
	String loc2;
	String loc3;
	Countries(String arg1,String arg2,String arg3)
	{
		loc1=arg1;
		loc2=arg2;
		loc3=arg3;
	}
}
class Development
{
	String branch1;
	String branch2;
	String branch3;
	Development(String arg1,String arg2,String arg3)
	{
		branch1=arg1;
		branch2=arg2;
		branch3=arg3;
	}
}
class Incomes
{
	String branch1;
	String branch2;
	String branch3;
	Incomes(String arg1,String arg2,String arg3)
	{
		branch1=arg1;
		branch2=arg2;
		branch3=arg3;
	}
}
class Department
{
	String dep1;
	String dep2;
	String dep3;
	String dep4;
	String dep5;
	Department(String arg1,String arg2,String arg3,String arg4,String arg5)
	{
		dep1=arg1;
		dep2=arg2;
		dep3=arg3;
		dep4=arg4;
		dep5=arg5;
	}
}
class company
{
	String name;
	company(String arg)
	{
		name=arg;
		System.out.println("Name of Organization is:"+name);
	}
	Engineers engdept=new Engineers("Ben Fried","engineering","research");
	Outcomes prodept=new Outcomes("Product Management","User Experience","Marketing");
	Countries saldept=new Countries("Americas","Europe,MiddleEast&Africa","Asia Pacific");
	Development legdept=new Development("General Counsel","Corporate Development","New Buisiness Development");
	Incomes findept=new Incomes("Treasurer","Real Estate","Financial Planning");
}
class Mycompany
{
	public static void main(String[] args)
	{
		company com=new company("GOOGLE");
		Department d1=new Department("engineering","products","sales","legal","finance");
		System.out.println("welcome to GOOGLE Organization");
		Scanner read=new Scanner(System.in);
		System.out.println("press 1 to know about organization");
		int no=read.nextInt();
		if(no==1)	 
		{
			System.out.println("press 1 to know about Engineering department");
			System.out.println("press 2 to know about Products department");
			System.out.println("press 3 to know about Sales department");
			System.out.println("press 4 to know about Legal department");
			System.out.println("press 5 to know about Finance department");
			no=read.nextInt();
			switch(no)
			{
			case 1:
				System.out.println("Welcome to"+ d1.dep1 +"department");
				System.out.println("Chief Information Officer is :"+com.engdept.name);
				System.out.println("Sub Branch1 is :"+com.engdept.branch1);
				System.out.println("Sub Branch2 is :"+com.engdept.branch2);
				break;
			case 2:

				System.out.println("Welcome to"+ d1.dep2 +"department");
				System.out.println("Sub Branch1 is :"+com.prodept.branch1);
				System.out.println("Sub Branch2 is :"+com.prodept.branch2);
				System.out.println("Sub Branch3 is :"+com.prodept.branch3);
				break;
			case 3:
				System.out.println("Welcome to"+ d1.dep3 +"department");
				System.out.println("Sub Branch1 is :"+com.saldept.loc1);
				System.out.println("Sub Branch2 is :"+com.saldept.loc2);
				System.out.println("Sub Branch3 is :"+com.saldept.loc3);
				break;
			case 4:
				System.out.println("Welcome to"+ d1.dep4 +"department");
				System.out.println("Sub Branch1 is:"+com.legdept.branch1);
				System.out.println("Sub Branch2 is :"+com.legdept.branch2);
				System.out.println("Sub Branch3 is :"+com.legdept.branch3);
				break;
			case 5:
				System.out.println("Welcome to"+ d1.dep5 +"department");
				System.out.println("Sub Branch1 is :"+com.findept.branch1);
				System.out.println("Sub Branch2 is :"+com.findept.branch2);
				System.out.println("Sub Branch3 is :"+com.findept.branch3);
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