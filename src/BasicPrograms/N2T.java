package BasicPrograms;

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
				case 1 : System.out.print("ONE");	break;
				case 2 : System.out.print("TWO");	break;
				case 3 : System.out.print("THREE");	break;
				case 4 : System.out.print("FOUR");	break;
				case 5 : System.out.print("FIVE");	break;
				case 6 : System.out.print("SIX");	break;
				case 7 : System.out.print("SEVEN");	break;
				case 8 : System.out.print("EIGHT");	break;
				case 9 : System.out.print("NINE");	break;
				default : System.out.print("ZERO");
			}
			System.out.print(" ");
		}
	}
}