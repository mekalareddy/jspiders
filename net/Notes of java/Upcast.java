class Demo5{
	int x=10;
	void test(){
		System.out.println("running test");
	}
}
class Demo6 extends Demo5{
	double y=9.8;
	void disp(){
		System.out.println("running disp");
	}
}
class Demo7 extends Demo5{
	char z='k';
	void view(){
		System.out.println("running view");
	}
}
class Sample1{
	void useInterface(Demo5 arg1){
		System.out.println(arg1.x);
		arg1.test();
	}
}
class Upcast{
	public static void main(String [] args){
		Sample1 s1 = new Sample1();
		s1.useInterface(new Demo5());
		s1.useInterface(new Demo6());
		s1.useInterface(new Demo7());
	}
}