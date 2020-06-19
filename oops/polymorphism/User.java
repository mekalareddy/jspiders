class Animal
{
	public void makenoise()
	{
		System.out.println("SOUND");
	}
}
class Dog extends Animal
{
	public void makenoise()
	{
		System.out.println("BBB");
	}
}
class Cat extends Animal
{
	public void makenoise()
	{
		System.out.println("MMM");
	}
}
class Snake extends Animal
{
	public void makenoise()
	{
		System.out.println("SSS");
	}
}
class Simulator
{
	public void produceSound(Animal a1)
	{
		a1.makenoise();
	}
}
class User
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		Cat c1=new Cat();
		Snake sn1=new Snake();
		Simulator s1=new Simulator();
		s1.produceSound(d1);
		s1.produceSound(c1);
		s1.produceSound(sn1);
	}
}

