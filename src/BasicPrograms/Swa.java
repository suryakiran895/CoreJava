class Swap
{
	public static void main(String args[])
	{
		int a=10,b=20;
		System.out.println("Before Swapping of two numbers \n a = "+a+" b = "+b);
		/* 
		a=a*b;	
		b=a/b;
		a=a/b;
		System.out.println("After Swapping of two numbers \n a = "+a+" b = "+b);
		*/
		
		a=a+b;	//30
		b=a-b;	//10
		a=a-b;	//20
		System.out.println("After Swapping of two numbers \n a = "+a+" b = "+b);
	}
}