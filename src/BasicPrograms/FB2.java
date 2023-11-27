package BasicPrograms;

class FB2
{
	public static void main(String args[])
	{
		int num1=20;
	//String s = num1%3==0 && num1%5==0 ? "Fizz Buzz" : num1%3==0 ? "Fizz" : num1%5 ? "Buzz" : num1%3!=0&&num1%5!=0 
		if(num1%3==0 && num1%5==0)
		System.out.println("Fizz Buzz");	
		else if(num1%3==0)
		System.out.println("Fizz");
		else if(num1%5==0)
		System.out.println("Buzz");
		else
		if(num1%3!=0)
			if(num1%5!=0)
				System.out.println(num1);
	}
}