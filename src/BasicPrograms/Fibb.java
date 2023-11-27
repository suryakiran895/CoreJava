package BasicPrograms;

class Fibb
{
	public static void main(String args[])
	{
		int num1=0, num2=1, num3=0,x=1,n=8;
		System.out.print(num1+"\t"+num2+"\t");
		while(x<=n)
		{
			
			num3 = num1 + num2;
			System.out.print(num3+"\t");
			num1=num2;
			num2=num3;
			x++;
		}
	}
}