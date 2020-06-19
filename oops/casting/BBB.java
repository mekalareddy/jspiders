class BBB
{
	public static void main(String[] args)
	{
		String s1="java";
		char[] chArr=s1.toCharArray();
		for(int i=0;i<chArr.length;i++)
		{
			int x=chArr[i];
			char c=(char)(x-32);
			System.out.print(c);
		}
	}
}