package BasicPrograms;

class Factorial_for
{
	public static void main(String args[])
	{
		int x,num=5,temp=0,fact=1;
		for(x=1;x<=num;x++)
		{
			fact=fact*x;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}