class UL
{
	public static void main(String args[])
	{
	char x = 'a';
	if(x >= 'A' && x<='Z')	//giving range from A to Z
	{
		System.out.println(x+" is in Upper case ");
	}
	else
	{
		System.out.println(x+" is in Lower case ");		
	}
	}
}

class UL2
{
	public static void main(String args[])
	{
		char a='T';
		if(a>='A' && a<= 'Z')
		{
			if(a<='S')
				System.out.println(a+" is in Uppercase, Until S");
			else
				System.out.println(a+" is in Uppercase From T to Z");
		}
		else
		{
			System.out.println(a+" is in Lowercase");
		}
	}
}


class Student
{
	public static void main(String args[])
	{
		String name = " Sandeep";
		int roll = 4, obtainedmarks=0,s1=89,s2=69,s3=76,s4=49,s5=66;
		char sec='D';
		double total=500,percentage=0;
		obtainedmarks = s1 + s2 + s3 + s4 + s5;
		percentage = (obtainedmarks/total)*100;
		System.out.println("obtaines marks = " +obtainedmarks);
		System.out.println("percentage = " +percentage);
		if(percentage >=81 && percentage<= 100)
		{
			sec='A';
			System.out.println("scolarship = 2000 and section = "+sec);
		}
		else if(percentage >=61 && percentage <= 80)
		{
			sec='B';
			System.out.println("scolarship= 1000 and section = "+sec);
		}
		else if(percentage<=50)
			System.out.println(" Not eligible for scolarship");
		else
			System.out.println(" Invalid Percentage");
	}
}


// Find largest among 3 numbers using logical AND (&&) , using ifelse ladder
class LA3IE
{
	public static void main(String args[])
	{
		int a=38,b=39,c=39;
		if(a>b && a>c)
			System.out.println(a+" is Largest No.");
		else if(b>a && b>c)
			System.out.println(b+" is Largest No.");
		else
			System.out.println(c+" is Largest No.");
	}
}








		