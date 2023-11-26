package constructor;

class ParameterizedConstructorDemo
{
	ParameterizedConstructorDemo(int a , int b)
	{
		System.out.println(a+b);
	}
}
public class ParameterizedConstructor 
{
	public static void main(String[] args) 
	{
		ParameterizedConstructorDemo pc = new ParameterizedConstructorDemo(10,20);
	}
}
