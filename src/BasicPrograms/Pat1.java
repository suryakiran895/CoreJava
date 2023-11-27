class Pat1
{
	public static void main(String args[])
	{
		int x,y;
		for(x=1;x<=4;x++)
		{
			for(y=x;y>0;y--)
			{
				System.out.print(y);
			}
			System.out.println();
		}
	}
}

class Pat2
{
	public static void main(String args[])
	{
		int x,y;
		char ch='A';
		for(x=1;x<=4;x++)
		{
			for(y=x;y>0;y--)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}