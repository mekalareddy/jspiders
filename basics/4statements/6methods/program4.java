class program4
{
	static void square(int num)
	{
		System.out.println("calculating square of"+num);
		int temp=num*num;
		System.out.println("square is"+temp);
	}
	public static void main(String[] args)
	{
		System.out.println("execution started");
		square(5);
		square(8);
		System.out.println("execution ended");
	}   
}
