import java.util.Scanner;
/*
class PrimeNum 			// Model : Using return type : void
{
	int num,temp;
	public void calPrime()
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				temp++;
				break;
			}
		}
	}
	public void printPrime()
	{
		if(temp==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
class PrimeNumMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		PrimeNum p = new PrimeNum();
		p.num=s.nextInt();
		p.calPrime();
		p.printPrime();
	}
}

	
class PrimeNum			//Model 2 : Using return type : int
{
	int num,temp;
	public int calPrime()
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				temp++;
				break;
			}
		}
		return temp;
	}
}
class PrimeNumMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		PrimeNum p = new PrimeNum();
		p.num=s.nextInt();
		int result = p.calPrime();
		if(result==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}


class PrimeNum			//Model 3 : Using parameters 
{
	int temp;
	public int calPrime(int num)
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				temp++;
				break;
			}
		}
		return temp;
	}
	public void printPrime(int x)
	{
		if(x==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
class PrimeNumMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		PrimeNum p = new PrimeNum();
		int number =s.nextInt();
		int result = p.calPrime(number);
		p.printPrime(result);
	}
}
*/
class PrimeNum			// Giving Prime Range
{
	int count;
	public int calPrime(int p)
	{
		count=0;
		for(int x=2;x<=p/2;x++)
		{
			if(p%x==0)
			{
				count++;	
				break;
			}
		}
		return count;
	}
}
class PrimeNumMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Prime Range\n From = ");
		PrimeNum p = new PrimeNum();
		int number1 = s.nextInt();
		System.out.print("To = ");
		int number2 = s.nextInt();
		for(int i=number1;i<=number2;i++)
		{
			int x = p.calPrime(i);
			if(x==0)
				System.out.print(i+",");
		}
	}
}
	
	
	