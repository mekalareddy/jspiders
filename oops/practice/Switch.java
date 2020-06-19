import java.util.Scanner;
class Switch
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		String alp=read.next();
		switch(alp)
		{
		case"A":System.out.println("excellent");
		break;
		case"B":System.out.println("good");
		break;
		case"c":System.out.println("average");
		break;			
		case"d":System.out.println("satisfactory");
		break;		
		case"e":System.out.println("poor");
		break;
		default:System.out.println("invalid entry");			
		}
	}	
}