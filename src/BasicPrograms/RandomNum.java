package BasicPrograms;

import java.util.Scanner;
import java.util.Random; 

class RandomNum
{
	int num,rev,temp;
	public int calPrime()
	{
		temp=num;
		for(;num>0;num/=10)
		{
			rev=rev*10+num%10;
		}
		num = temp;
		return rev;
	}
}
class RandomNumMain
{
	public static void  main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number Range\nFrom = ");
		int num1 = s.nextInt();
		System.out.print("To = ");
		int num2 = s.nextInt();
		Random r = new Random();
		RandomNum rn = new RandomNum(); 
		rn.num = r.nextInt(num1,num2);
		System.out.println(rn.num);
		//int temp = p.num;
		int result = rn.calPrime();
		// p.num=temp;
		if(result==rn.num)		// if(result==p.num)	
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}
}

class RandomOtp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Random rm = new Random();
		int otp = rm.nextInt(num1,num2);
		System.out.println("your OTP is " +otp);
	}
}