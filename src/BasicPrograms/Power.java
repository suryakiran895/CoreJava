import java.util.Scanner;
class Power
{
	public static void main(String args[])
	{
		int num,temp=0,x,rem=0,sum=0,product=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		temp=num;
		for(;num>0;num/=10)
		{
			rem = num%10;
			sum = sum+rem;
			product = product * rem;
		}
		if(sum==product)
			System.out.print("Power Number");
		else
			System.out.println("Not a Power Number");
	}
}