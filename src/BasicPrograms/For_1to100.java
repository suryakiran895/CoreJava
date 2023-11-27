package BasicPrograms;

class For_1to100
{
	public static void main(String args[])
	{
		// boolean x=true;
		int x=1, temp=0;
		for(;x<=100;x++)
		{
			temp++;
			System.out.println(x);
		}
		System.out.println("Total number of iteration "+temp);
	}

}
