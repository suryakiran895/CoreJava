package BasicPrograms;

class EOsum
{
	public static void main(String args[])
	{
		int num=6721,x,rem=0,rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		for(x=1;x<=rev;rev/=10)
		{
			
			rem=rev%10;
			if(rem%2==0)
			{
				rem = rem +2;
				System.out.print(rem);
			}
			else if(rem%2==1)
			{
				rem = rem+1;
				System.out.print(rem);	//8
			}
		}
	}
}