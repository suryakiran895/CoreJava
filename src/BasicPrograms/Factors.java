package BasicPrograms;
// Write a program to print factors of a number
class Factors
{
	public static void main(String args[])
	{
		int num=2,temp=0,x=1,sum=0,mul=1;
		while(x<=num)
		{
			if(num%x==0)
			{	
				temp++;
				System.out.println(x);
				if(x%2==0)
					sum=sum+x;
				else
					mul=mul*x;	
			}	
			x++;
		}
		System.out.println("sum of even numbers is "+sum);
		System.out.println("multiplication of odd numbers is "+mul);
		System.out.println("Total number of factors : "+temp);
		if(temp==2)
			System.out.println("its a right number");
		else
			System.out.println("its a Wrong number");
	
	}
}