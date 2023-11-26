package constructor;

import java.util.Scanner;
class PrimeUsingConstructorDemo
{
	int num,fact;
	Scanner sc = new Scanner(System.in);
	PrimeUsingConstructorDemo()
	{
		System.out.println("Enter the Number");
		num = sc.nextInt();
	}
	public void calPrime()
	{
		for(int x=1;x<=num;x++)
		{
			if(num%x==0)
				fact++;
		}
		if(fact==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
public class PrimeUsingConstructor 
{
	public static void main(String[] args) 
	{
		PrimeUsingConstructorDemo pc = new PrimeUsingConstructorDemo();
		pc.calPrime();
	}
}
