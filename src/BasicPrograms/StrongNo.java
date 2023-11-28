package BasicPrograms;
//Strong number 145 = 145 after 1!+4!+5!

import java.util.Scanner;
class StrongNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int rem=0,fact=1,sum=0,temp=num;
		for(;num>0;num/=10)
		{
			fact=1;
			rem=num%10;
			for(int x=1;x<=rem;x++)
			{
				fact=fact*x;
			}
			sum=sum+fact;
		}
		num=temp;
		if(num==sum)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}
}
		