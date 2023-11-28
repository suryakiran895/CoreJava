package BasicPrograms;

class MN
{
	public static void main(String args[])
	{
		int m=5, n=4,x=1,pow=1;
		/* while(x<=n)
		{
			pow=pow*m;
			x++;
		} */
		pow=(int)Math.pow(m,n);
		System.out.println(m+" power "+n+" is "+ pow);
	}
}