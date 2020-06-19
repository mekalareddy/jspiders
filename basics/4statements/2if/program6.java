class program6
{
	public static void main(String[] args)
	{
		int exppin=1111;
		double accbal=5000.00;
		double amt=3000.00;
		if(exppin==1112)
		{
			System.out.println("valid pin");	
			if(amt<=accbal)
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
		else
		{
			System.out.println("invalid pin!");	
		}
	}
}