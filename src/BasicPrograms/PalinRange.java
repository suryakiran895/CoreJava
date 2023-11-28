package BasicPrograms;

import java.util.Scanner;
class PalinRange		// Palindrom Range and sum of the all palindromes and find how many palindromes are there
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Palindrom Range\nFrom = ");
		int x = s.nextInt();
		System.out.print("To = ");
		int num = s.nextInt();
		int number=0,rem=0,rev=0,count=0,sum=0;
		for(;x<num;x++)
		{
			number = x;
			rev=0;
			for(;number>0;number/=10)
			{
				rem=number%10;
				rev=rev*10+rem;
			}
			number = x;
			if(number == rev)
			{
			System.out.println(number+" is a palindromic Number");
			sum=sum+rev;
			count++;	
			}
		}
		System.out.println("Total number of palindroms is = "+count);
		System.out.println("Sum of all Palindrome Numbers is  = "+sum);
	}
}       	
			