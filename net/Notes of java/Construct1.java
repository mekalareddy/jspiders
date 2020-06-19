class Sample{
	Sample(){
		this(7);
		System.out.println("running no-arguement constructior");
	}
	Sample(int arg){
		System.out.println("running parametarised constructor");
		System.out.println("arg value is " +arg);
	}
}
class Construct1{
	public static void main(String args[]){
		Sample s1 = new Sample();
	}
}
