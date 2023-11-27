package BasicPrograms;

class EO
{
	public static void main(String args[])
	{
		int n=54;
		if(n==1)
		{
			n=3*n+1;
			System.out.print(n+"\t");
		}	
		while(n != 1 && n != 0)
		{
		if(n%2==0)
		{
			n=n/2;
			System.out.print(n+"\t");
		}
		else
		{
			n=3*n+1;
			System.out.print(n+"\t");
		}
		}
		if(n==0)
			System.out.println(n);
		
	}
}	