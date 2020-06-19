class Mobile
{
	String os;
	int ram;
	String brand;
	Mobile(String arg1,int arg2,String arg3) 
	{
		os=arg1;
		ram=arg2;
		brand=arg3;
	}  
} 
class Mainclass2
{
	public static void main(String[] args)
	{
		Mobile[] mArr=new Mobile[5];
		mArr[0]=new Mobile("android",2,"sony");
		mArr[1]=new Mobile("android",4,"samsung");
		mArr[2]=new Mobile("ios",6,"apple");
		mArr[3]=new Mobile("android",8,"htc");
		mArr[4]=new Mobile("android",10,"microsoft");
		for(int i=0;i<mArr.length;i++)
		{
			System.out.println(mArr[i].os+"\t"+mArr[i].ram+"\t"+mArr[i].brand);
		}
	}
} 
