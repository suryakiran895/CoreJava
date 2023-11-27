package BasicPrograms;

class Fact_for
{
	public static void main(String args[])
	{
		int x,num=32;
		for(x=1;x<=num;x++)
		{
			if(num%x==0)
				System.out.println(x);
		}
	}
}