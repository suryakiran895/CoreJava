package polymorphism;
class StaticMethodSuper
{
	public static void calSum()
	{
		System.out.println("Super class Static Method");
	}
	public static void calSum(int a)
	{
		System.out.println("Parameterized Super class Static Method");	
	}
}
class StaticMethodSub extends StaticMethodSuper
{
	public static void calSum()
	{
		System.out.println("Sub class Static Method");
	}
}
public class OverridingStaticMethodsIsPossibleOrNot	//Static Methods can't override
{
	public static void main(String[] args) 
	{
		StaticMethodSuper sm = new StaticMethodSub();
		sm.calSum();
	}
}
