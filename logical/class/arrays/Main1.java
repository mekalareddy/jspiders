//TO DISPLAY 5 ARRAYS
class Main1
{
	public static void main(String[] args)
	{
		int[] ar=new int[5];
		ar[3]=5;
		for(int i=0;i<ar.length;i++)
		{ 
			System.out.println(i+"----->"+ar[i]);
		}
	}
}