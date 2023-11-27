package BasicPrograms;

class DHM	// input : days , output : months having days which you given in input
{
	public static void main(String args[])
	{
		int days=31;
		switch(days)
		{
			case 28 : System.out.println("February has "+days+" days");
			break;
			case 31 : System.out.println("January \n March \n May \n July \n August \n October \n December\n The above mentioned months having "+days+" days");
			break;
			case 30 : System.out.println("April \n June \n September \n November \n The above mentioned having "+days+" days");
			break;
			default : System.out.println("Invalid Input");
		}
	}
}