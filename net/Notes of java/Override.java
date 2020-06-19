
class Demo1{
	void test(){
		System.out.println("running demo1...");
	}
}
class Demo2 extends Demo1{
	void test(){
		System.out.println("test function overrided");
	}
	void test(int ag){
		System.out.println("Running 2nd test method");
		System.out.println("arg value is "+ag);
	}
}
class Demo3 extends Demo2{
	void test(){
		super.test();
		System.out.println("running demo3...");
	}
}
class Override{
	public static void main(String args[]){
		Demo3 d1 = new Demo3();
		d1.test();
		d1.test(7);
	}
}

