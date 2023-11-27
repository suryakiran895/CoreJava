package BasicPrograms;

import java.util.Scanner;	// 753357 ==> count no. and divide into two parts & reverse the last part and compare==> if 753 == 753 then it is a bit number
class BitNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int rem=0,fact=1,sum=0,temp=num,count=0,rev=0;
		for(;num>0;num/=10)
		{
			count++;
		}
		if(count%2==0)
		{
		num=temp;
		for(int x=1;x<=count/2;x++)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==num)
			System.out.println("Bit Number");
		else
			System.out.println("Not Bit number");
		}
		else
			System.out.println(" Not Bit number");
	}
}
		