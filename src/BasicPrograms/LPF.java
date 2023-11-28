package BasicPrograms;

import java.util.Scanner;	//Largest Prime Factor
class LPF
{
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = s.nextInt();
	int x,y,rem=0,count=0,temp=0;
	
	for(x=1;x<=12;x++)
	{
		if(num%x==0)
		{
		count=0;
		//System.out.print(x+" ");
		for(y=1;y<=x;y++)
		{
			if(x%y==0)
			{
				count++;	
			}
			
		}
		if(count==2)
		{
			if(x>temp)
			//System.out.print("\t"+x);
			temp=x;
		}
		}
	}
	System.out.println("\nLargest Prime Factor "+temp);
	}
}
		