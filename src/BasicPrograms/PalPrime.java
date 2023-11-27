import java.util.Scanner;
class PalPrime
{
	public static void main(String args[])
	{
		int num,x,y,rem=0,rev=0,count=0,count2=0,temp=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		for(x=1;x<=num;x++)			//1<=1
		{
			temp=x;rev=0;count=0;
			for(;x>0;x/=10)			//
			{
				rem=x%10;
				rev=rev*10+rem;
			}
			x=temp;
			if(x==rev)	// True means its a palindrome
			{	
				//System.out.print(x+" ");
				for(y=1;y<=x;y++)		// 2<=1
				{
					if(x%y==0)
						count++;
					
				}
				x=temp;
				if(count==2)
				{
					count2++;
					System.out.print(x+",");
				}
				if(count2==10)
				{
					break;
				}	
			}
		}
	}
}
	