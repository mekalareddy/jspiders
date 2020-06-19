class program6
{
	static int add(int num1,int num2)
	{
		System.out.println("adding"+num1+","+num2);
		int res=num1+num2;
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println("execution started");
		int x=add(10,12);
		System.out.println("result is "+x);
		int y=add(14,54);
		System.out.println("result is "+y);
		System.out.println("execution ended");
	}  
}	   
