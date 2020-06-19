class x{
	void wish(){
		System.out.println("hi");
	}}
class y extends x{
	void wish(){
		System.out.println("bye");
	}}
class Eg2{
	public static void main(String[] args){
		x x1= new y();
		x1.wish();
	}}