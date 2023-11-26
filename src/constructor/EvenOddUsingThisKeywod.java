package constructor;

import java.util.Scanner;
class EvenOddUsingThisKeywodDemo
{
	int a,b,temp;
	EvenOddUsingThisKeywodDemo(int a,int b)
	{
		this.a=a;	this.b=b;
	}
	public void calEven()
	{
		temp = a;
		for(;a<=b;a++)
		{
			if(a%2==0)
				System.out.print(a+" ");
		}
	}
	public void calOdd()
	{
		a = temp;
		for(;a<=b;a++)
		{
			if(a%2==1)
				System.out.print(a+" ");
		}
	}
}
public class EvenOddUsingThisKeywod 
{
	public static void main(String[] args) 
	{
		int a ,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range\nFrom\t:\t");
		a = sc.nextInt();
		System.out.print("To\t:\t");
		b = sc.nextInt();
		sc.close();
		EvenOddUsingThisKeywodDemo eo = new EvenOddUsingThisKeywodDemo(a,b);
		System.out.println("Even Numbers");
		eo.calEven();
		System.out.println();
		System.out.println("Odd Numbers");
		eo.calOdd();	
	}
}
