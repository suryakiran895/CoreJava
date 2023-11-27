class Prime_for
{
	public static void main(String args[])
	{
		int num=313, x=1, temp=0,count=0;
		for(;x<=num;x++)
		{
			count++;
			if(num%x==0)
			{
			temp++;
			}	
		}
		System.out.println("Number of factors is "+temp);
		System.out.println("Number of comparisions is "+count);
		if(temp==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}

class Prime_for2
{
	public static void main(String args[])
	{
		int num=313, x, temp=0,count=0;
		for(x=2;x<=num/2;x++)
		{
			count++;
			if(num%x==0)
			temp++;
		}
		System.out.println("Number of comparisions is "+count);
		System.out.println("Number of factors is "+temp);
		if(temp==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}

class Prime_for3
{
	public static void main(String args[])
	{
		int num=313, x, temp=0,count=0;
		for(x=2;x<=num/2;x++)
		{
			count++;
			if(num%x==0)
			{
			temp++;
			break;
			}
		}
		System.out.println("Number of comparisions is "+count);
		if(temp==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}