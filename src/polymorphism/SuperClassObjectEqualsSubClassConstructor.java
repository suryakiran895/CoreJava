package polymorphism;
class Super
{
	public void calSum()
	{
		System.out.println("Addition");
	}
}
class Sub extends Super
{
	public void calSum()
	{
		System.out.println("Addition +");
	}
}
public class SuperClassObjectEqualsSubClassConstructor 
{
	public static void main(String[] args) 
	{
		Super s = new Sub();	//Upcasting
		s.calSum();
	}
}
