package BasicPrograms;

class InDe
{
	public static void main(String args[])
	{
		int a=10,b,c;
		b=(++a) + (a);	//11+11=22
		c=b++;	//22
		System.out.println(a+" "+b+" "+c);
	}
}

class Increment
{
	public static void main(String args[])
	{
		int a=28,b=38;
	/*	System.out.println(a);	//28	
		a=++a;	//29
		System.out.println(a);	//29
		a=a++;	//29
		System.out.println(a);	//30
	*/

		System.out.println(a);
		System.out.println(a++);	//post increment: the value of a is assigned to 
		System.out.println(a);
	}
}
