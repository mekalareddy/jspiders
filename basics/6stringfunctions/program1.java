class program1
{
	public static void main(String[] args)
	{
		System.out.println("program starts......");
		String s1="javadevelopers";
		int x1=s1.length();
		System.out.println(x1);
		char c1=s1.charAt(4);
		System.out.println(c1);
		int x2=s1.indexOf('e');
		System.out.println(x2);
		int x3=s1.indexOf('e',x2+1);
		System.out.println(x3);
		int x4=s1.indexOf('e',x3+1);
		System.out.println(x4);
		int x5=s1.lastIndexOf('e');
		System.out.println(x5);
		int x6=s1.lastIndexOf('e',x5-1);
		System.out.println(x6);
		boolean b1=s1.contains("dev");
		System.out.println(b1);
		boolean b2=s1.startsWith("java");
		System.out.println(b2);
		boolean b3=s1.endsWith("per");
		System.out.println(b3);
		String s2=s1.substring(8);
		System.out.println(s2);
		String s3=s1.substring(4,11);
		System.out.println(s3);
		String s4=s1.toUpperCase();
		System.out.println(s4);
		String s5=s4.toLowerCase();
		System.out.println(s5);
		System.out.println("program ended");
	}
}  