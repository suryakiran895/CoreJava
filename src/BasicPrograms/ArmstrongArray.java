package BasicPrograms;

import java.util.Scanner;
class ArmstrongArray
{
	public static void main(String args[])
	{
		int temp=0,count=0,sum=0,rem=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Array elements: ");
		for(int x=0;x<size;x++)
		{
			arr[x]=s.nextInt();
		}
		
		for(int y=0;y<arr.length;y++)
		{
			temp=arr[y];	count=0; sum=0;
			for(;temp>0;temp/=10)
				count++;
			temp=arr[y];
			for(;temp>0;temp/=10)
			{
				rem=temp%10;
				sum=(int)(sum+Math.pow(rem,count));
			}
			if(sum==arr[y])
				System.out.print(arr[y]+" ");
		}
		
	}
}