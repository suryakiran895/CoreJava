package BasicPrograms;

import java.util.Scanner;
class PalinNum
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
class PalinNumMain
{
	public static void  main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		PalinNum p = new PalinNum();
		p.num=s.nextInt();
		//int temp = p.num;
		int result = p.calPrime();
		// p.num=temp;
		if(result==p.num)		// if(result==p.num)	
			System.out.println("Palin Number");
		else
			System.out.println("Not a Palin Number");
	}
}