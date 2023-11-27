package BasicPrograms;

import java.util.Scanner;
class FibbPrime
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Range\nFrom = \t");
		int x = s.nextInt();
		System.out.print("To = \t");
		int number = s.nextInt();
		int num1=0,num2=1,num3=0,rem=0,rev=0,count=0,prime=0;
		System.out.print(num1+" "+num2);
		//int temp =x;
		for(;x<number;x++)	//
		{

			num3=num1+num2;
			//System.out.println("\t"+num3);
			num1=num2;
			num2=num3;
			count=0;
			for(x=0;x<number;x++)
			{
				for(int y=2;y<=x/2;y++)
				{
					rem=x%y;
					if(rem==0)
						count++;
					break;
				}
				if(rem==0)
					prime=x;
				System.out.print(" "+num3+" "+prime+" ");
			}
		}
	}
}