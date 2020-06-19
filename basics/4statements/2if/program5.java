class program5
{
	public static void main(String[] args)
	{
		double accbal=5000.00;
		double amt=3000.00;
		if (amt<=accbal)
		{
			accbal=accbal-amt;
			System.out.println("withdraw success......!");
		}	
		else
		{
			System.out.println("withdraw failed");
			System.out.println("insufficient balance,try later,,,,!");
		}
		System.out.println("account bal is"+accbal);
	}
}