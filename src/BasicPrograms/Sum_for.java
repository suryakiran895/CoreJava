class Sum_for
{
	public static void main(String args[])
	{
		int x,length=15,temp=0,sum=0;
		for(x=1;x<=length;x++)
		{
			temp++;
			sum=sum+x;
			if(temp==5)
				break;
		}
		System.out.println("Sum of first five digits is "+sum);
	}
}