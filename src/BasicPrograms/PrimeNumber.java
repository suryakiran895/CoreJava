package BasicPrograms;

import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		int t=s.nextInt();
		for(int i=f;i<=t;i++)
		{
			if(prime(i)==2)
				System.out.println(i);
		}

	}

	public static int prime(int y)
	{
		int count=0,temp=0;
		for(int j=1;j<=y;j++)
		{
			if(y%j==0)
				count++;
		}
		return count;
	}

}