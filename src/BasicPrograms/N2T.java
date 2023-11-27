import java.util.Scanner;
class N2T	//i/p = 45 , o/p = four five	//14th FEB
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt();
		int rem=0, rev=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		for(;rev>0;rev/=10)
		{
			rem=rev%10;
			switch(rem)
			{
				case 1 : System.out.println("ONE");	break;
				case 2 : System.out.println("TWO");	break;
				case 3 : System.out.println("THREE");	break;
				case 4 : System.out.println("FOUR");	break;
				case 5 : System.out.println("FIVE");	break;
				case 6 : System.out.println("SIX");	break;
				case 7 : System.out.println("SEVEN");	break;
				case 8 : System.out.println("EIGHT");	break;
				case 9 : System.out.println("NINE");	break;
				default : System.out.println("ZERO");
			}
		}
	}
}