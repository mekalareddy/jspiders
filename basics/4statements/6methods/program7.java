class program7
{
	static void square(int num)
	{
		System.out.println("calculating square of"+num);
		int temp=num*num;
		System.out.println("square is "+temp);
		if(num<10)
		{
			square(++num);//call itself....recurrence
		}
	}
	public static void main(String[] args)
	{
		System.out.println("execution started");
		square(1);
		System.out.println("execution ended");
	}  
}	   
