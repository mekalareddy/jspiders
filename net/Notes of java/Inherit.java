class Demo1{

	int x=10;
	void test(){
		System.out.println("running test");
	}
}
class Demo2 extends Demo1{
	int y =7;
	void disp(){
		System.out.println("running disp");
	}
}
class Inherit{
	public static void main(String args[]){
		Demo2 d1 = new Demo2();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.test();
		d1.disp();
	}
}




