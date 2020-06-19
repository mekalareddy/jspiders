class Demo2{
	Demo2()
	{
		System.out.println("running demo2");
	}
}
class Demo1 extends Demo2 {
	Demo1(int args)
	{
		System.out.println("running demo1");
		System.out.println("arg value is"+args);
	}
}
class Demo0 extends Demo1 {
	Demo0()
	{
		super(7);
		System.out.println("running demo0");
	}
}
class InheritSample{
	public static void main(String args[]){
		Demo0 d1 = new Demo0();
	}
}