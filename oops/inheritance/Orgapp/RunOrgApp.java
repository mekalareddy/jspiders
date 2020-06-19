import java.util.Scanner;
class RunOrgApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Welcome to JSpiders Pvt Ltd");
		Organization jspOrg=new Organization("Jspider");
		int choice;
		try
		{
			do
			{
				System.out.println("Enter your Choice \n 1. Add Record \n 2. Display Record");
				choice=sc.nextInt();
				switch (choice)
				{
				case 1: String ch;
				System.out.println("Select the Department to enter Employee Record \n s. Sales Deparmtent \n m. Marketing Department \n i. IT Department \n n. To exit");
				ch=sc.next();

				switch (ch)
				{
				case "s": System.out.println("Enter the Name of Employee");
				String sname=sc.next();
				System.out.println("Enter the ID of Employee");
				int sid=sc.nextInt();
				jspOrg.salesDept.addEmployee(new Employee(sid,sname));
				break;

				case "m": System.out.println("Enter the Name of Employee");
				String mname=sc.next();
				System.out.println("Enter the ID of Employee");
				int mid=sc.nextInt();
				jspOrg.marketingDept.addEmployee(new Employee(mid,mname));
				break;

				case "i": System.out.println("Enter the Name of Employee");
				String iname=sc.next();
				System.out.println("Enter the ID of Employee");
				int iid=sc.nextInt();
				jspOrg.itDept.addEmployee(new Employee(iid,iname));
				break;
				case "n": System.exit(0);
				default : System.out .println("Invalid Choice");

				}
				break;



				case 2: String dispch;
				System.out.println("Select the department details you want to see \n s. Sales Deparmtent \n m. Marketing Department \n i. IT Department \n n. To exit ");
				dispch=sc.next();
				switch (dispch)
				{
				case "s": System.out.println("Employee id: \t Employee name:"); 
				for (int i=0;i<jspOrg.salesDept.index;i++ )
				{
					System.out.println(jspOrg.salesDept.strArr[i].id+" \t \t"+jspOrg.salesDept.strArr[i].name);
				}
				break;

				case "m": System.out.println("Employee id: \t Employee name:");
				for (int i=0;i<jspOrg.marketingDept.index;i++ )
				{
					System.out.println(jspOrg.marketingDept.strArr[i].id+" \t "+jspOrg.marketingDept.strArr[i].name);
				}
				break;

				case "i": System.out.println("Employee id: \t Employee name:");
				for (int i=0;i<jspOrg.itDept.index;i++ )
				{
					System.out.println(jspOrg.itDept.strArr[i].id+" \t "+jspOrg.itDept.strArr[i].name);
				}
				break;
				case "n": System.exit(0);
				default : System.out .println("Invalid Choice");
				}

				break;
				}
			}
			while (choice!=1 || choice!=2);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}
