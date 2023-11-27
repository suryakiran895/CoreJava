package BasicPrograms;

class EO1
{
	public static void main(String args[])
	{
		int n=1;	//n=2
		while(n > 1)	//2>1=T
		{		
		if(n%2==0)	//2%2=0
		{
			n=n/2;	//2/2=1
			System.out.print(n+"\t");	//1
		}
		else
		{
			n=3*n+1;
			System.out.print(n+"\t");
		}
		}
		System.out.println(n);
		
	}
}	