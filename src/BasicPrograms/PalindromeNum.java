package BasicPrograms;

import java.util.Scanner;
/*
class PalindromeNum
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Range\nFrom = ");
		int num = s.nextInt();
		System.out.print("To = ");
		int num1 = s.nextInt();
		int rev=0,sum=0,temp=0;
		//for(int x=num;x<=num1;x++)
		for(;num<=num1;num++)
		{
			temp=num;
			rev=0;
		for(;temp>0;temp/=10)
		{
			rev=rev*10+temp%10;
		}
		if(num==rev)
			System.out.println(rev);
		}
	}
}


//	Model 1:	Return Type : void
class PalindromeNum
{
	int num,rev,temp;
	public void calPalin()
	{
		temp=num;
		for(;num>0;num/=10)
		{
			rev = rev * 10 + num%10;
		}
		num=temp;
	}
	public void printPalin()
	{
		if(rev==num)
			System.out.println(num);
	}
}
class PalindromeNumMain
{
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		PalindromeNum p = new PalindromeNum();
		System.out.println("Enter a number");
		p.num = s.nextInt();
		p.calPalin();
		p.printPalin();
		
	}
}
*/
class PalindromeNum	//	Model 2 :	Return Type : Data Type // using of return key word is must			
{
	int num,rev,temp;
	public int calPrime()
	{
		temp=num;
		for(;num>0;num/=10)
		{
			rev = rev * 10 + num % 10;
		}
		num = temp;
		return rev;
	}
}
class PalindromeNumMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		PalindromeNum p = new PalindromeNum();
		p.num=s.nextInt();
		int rev = p.calPrime();
		if(rev==p.num)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}
		
}
/*
//	Model 3:	Return Type : Data Type & void 		Parameters Passing through method call statements
class PalindromeNum
{
	int rev,temp;
	public int calPalin(int num)
	{
		temp = num;
		rev=0;
		for(;num>0;num/=10)
		{
			rev = rev*10+num%10;
		}
		num=temp;
		return rev;
	}
	public void printPalin(int rev,int num)
	{
		if(num==rev)
			System.out.print(num+",");
	}
	
}
class PalindromeNumMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Range\nFrom = ");
		PalindromeNum p = new PalindromeNum();
		int num1 = s.nextInt();
		System.out.print("To = ");
		int num2 = s.nextInt();
		for(int i = num1;i<=num2;i++)
		{
		int x = p.calPalin(i);
		p.printPalin(x,i);
		}
		
	}
}
*/

