class program2
{
	public static void main(String[] args)
	{
		String[] StrArr=new String[5];
		StrArr[0]="Ramesh";
		StrArr[1]="Suresh";
		StrArr[2]="ganesh";
		StrArr[3]="mukesh";
		StrArr[4]="jaggesh";
		System.out.println("string array size"+StrArr.length);
		for(int i=0;i<StrArr.length;i++)
		{
			System.out.println(StrArr[i]);
		}
	}
}