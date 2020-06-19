class Demo1{
	int x=10;
	void test(){
		System.out.println("running test....");
	}
}
class Demo2 extends Demo1{
	double y=1.7;
	void disp(){
		System.out.println("running disp");
	}
}
class Demo3 extends Demo2{
	char z='a';
	void view(){
		System.out.println("running view...");
	}
}   
class ClassType2{
	public static void main(String [] args){
		Demo1 d4 = (Demo1) new Demo2();
		Demo3 d3 = new Demo3();
		System.out.println(d3.z);
		d3.view();
		System.out.println(d3.x);
		d3.test();
		System.out.println(d3.x);
		d3.test();
		Demo2 d2 = d3;//Demo2 d1 = new Demo2();
		System.out.println(d3.x);
		d3.test();
		System.out.println(d3.y);
		d3.disp();
		Demo1 d1 = d3;//Demo1 d2 = (Demo1)d1;
		System.out.println(d3.x);
		d3.test();

	}
}

