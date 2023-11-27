package BasicPrograms;

import java.util.Scanner;
class Automatic
{
	public static void main(String args[])
	{
		int num,temp=0,x,rem=0,num1=0,count=0,rev=0,rev2=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		num1=num*num;
		temp=num1;
		for(;num1>0;num1/=10)
		{
			count++;
		}
		num1=temp;
		if(count%2==0)
		{
			for(x=1;x<=count/2;x++)
			{
				rem=num1%10;
				rev=rev*10+rem;
				num1/=10;
			}
			for(;rev>0;rev/=10)
			{
				rem=rev%10;
				rev2=rev2*10+rem;
			}
			if(rev2==num)
				System.out.println("Automatic Number");
			else
				System.out.println("Not Automatic Number");
		}
	}
}
				