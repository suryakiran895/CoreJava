package BasicPrograms;

import java.util.Scanner;
class PalinPrime		// Palindromic Prim Number if possible factorial.
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Palindrom Range\nFrom = ");
		int x = s.nextInt();
		System.out.print("To = ");
		int num = s.nextInt();
		int number=0,rem=0,rev=0,count=0,sum=0,fact=1,y,z;
		for(;x<num;x++)				//1<100//
		{					
			number = x;			//number=1
			rev=0;
			count=0;
			for(;number>0;number/=10)		//1>0//0
			{
				rem=number%10;		//rem=1
				rev=rev*10+rem;		//rev=1
			}
			number = x;			//1
			if(number == rev)		//1==1
			{
				int Palin = rev;
				for(y=1;y<=number;y++)	//
				{
					if(number%y==0)
					count++;
				}
				
			if(count==2)
			{
				
				System.out.println(number+" is a Palindromic Prime Number");
				for(;Palin>0;Palin/=10)
				{
					fact=1;
					sum=0;
					rem=Palin%10;		//2//
					for(z=1;z<=rem;z++)	//1<=2//2<=2
					{
						fact=fact*z;	//1//2
						sum=sum+fact;	//1//3
					}
				}
			}
			}
		}
		//System.out.println("Sum of factorial of Palindromic Prime Numbers is:"+sum);
	}
}
				