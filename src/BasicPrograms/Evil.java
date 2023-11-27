package BasicPrograms;

import java.util.Scanner;
class Evil
{
	public static void main(String args[])
	{
		int num,num1=0,count=0,sum=0,rem=0,temp=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		temp=num;
		num1 = num *num;
		for(;num1>0;num1/=10)
		{
			rem=num1%10;
			sum=sum+rem;
		}
		num=temp;
		if(num==sum)
			System.out.println("Evil Number");
		else
			System.out.println("Not a Evil Number");
	}
}
		