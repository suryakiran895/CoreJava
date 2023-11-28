package BasicPrograms;

import java.util.*;
class Rev
{
	public static void main(String args[])
	{
		int x, num=57098000 , rem=0,count=0,digit=0,rev=0, rev1=0,y;
		System.out.println("Given Number = "+num);	
		for(x=1;x<num;num/=10)
		{
			rem=num%10;
			count++;
			rev=rev*10+rem;
		}
		
		System.out.println("Revese Number = "+rev);
		for(x=1;x<rev;rev/=10)
		{
			rem=rev%10;
			rev1=rev1*10+rem;
			digit++;
		}
		count=count-digit;
		//rev1=(int)(rev1*Math.pow(10,count));
		for(y=1;y<=count;y++)
		{
			rev1=rev1*10;
		}
		System.out.println("Revese of Reverse = "+rev1);
		 
	}
	
}

//Rev program Normal	// it fails to reverse the numbers having zeros at last ex: 35000 reverse will be 53 so prefer above or below programs
class Rev1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int rev=0;
		while(num>0)	//while(num!=0)
		{
			rev = rev * 10 + num % 10;
			num/=10;
		}
		System.out.println("Reverse Number is "+rev);
	}
}

// Rev Program Using String Buffer
class Rev2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println("Reverse Number is "+ sb.reverse());
	}
}
			
// Rev Program Using String Builder
class Rev3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		System.out.println("Reverse Number is "+ sb.reverse());
	}
}				

//Find out second largest digit in a number.