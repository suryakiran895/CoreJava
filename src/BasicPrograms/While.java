package BasicPrograms;

class While
{
	public static void main(String args[])
	{
		// boolean x=true;
		int x=1, temp=0;
		while(x<=100)
		{
			temp++;
			System.out.println("Bye");
			x++;	
		}
		System.out.println(temp);
	}

}

class W_ex1
{
	public static void main(String args[])
	{
		int x=1;
		while(x<11)
		{	
			System.out.println(x);
			++x;
		}
	}
}

class W_ex2
{
	public static void main(String args[])
	{
		int x=10;
		while(x>0)
		{
			System.out.println(x);
			x--;
		}
	}
}


