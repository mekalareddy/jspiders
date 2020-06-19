class Demo3{
	int x=10;
}
class Demo4 extends Demo3{
	int x=100;
	void display(){
		int x=1000;
		System.out.println("x value" +x );
		System.out.println("x value" +this.x );
	}
}
class Eg1{
	public static void main(String args[]){
		Demo4 d1 = new Demo4();
		d1.display();
	}
}