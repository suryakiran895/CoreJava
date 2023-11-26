package exception_handling;
class NTDemo
{
	public static void calEven()
	{
		int x=1,y=10;
		for(;x<y;x++)
		{
			if(x%2==0)
				System.out.print(x+" ");
		}
		System.out.println();
		calOdd();
	}
	public static void calOdd()
	{
		int x=1,y=10;
		for(;x<y;x++)
		{
			if(x%2==1)
				System.out.print(x+" ");
		}
	}
}
public class NormalTermination 
{
	public static void main(String[] args) 
	{
		NTDemo nt = new NTDemo();
		nt.calEven();
	}
}
