package BasicPrograms;

class Rev_Palin
{
	public static void main(String args[])
	{
		int num=3678,rem=0,rev=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;

		}
		System.out.println("Reverse of a number "+temp+" is "+rev);
		if(temp==rev)
			System.out.println("Palindrom");
		else
			System.out.println("Not a Palindrome");
	}
}