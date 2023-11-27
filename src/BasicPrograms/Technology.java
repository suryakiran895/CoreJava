import java.util.Scanner;
class Technology
{
	public static void main(String args[])
	{
		int num, num1=0,num2=0,num3=0,temp=0,count=0,x,rem=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		temp=num;
		for(;num>0;num/=10)
		{
			count++;		//4
		}
		num=temp;			//2025
		//System.out.println(count);
		if(count%2==0)		
		{
			for(x=1;x<=count/2;x++)		// 52
			{
				rem = num%10;		//5//2
				num2 = num2 * 10 + rem;	//5//52
				num=num/=10;		//202//20
			}
			for(;num2>0;num2/=10)		//25
			{
				rem=num2%10;		//2//5
				num3 = num3 * 10 + rem;	//2//25
			}
			num2=num+num3;
			num2=num2*num2;//(int)Math.pow(num2,2);
			num=temp;
			if(num==num2)
				System.out.println("Technology Number");
			else
				System.out.println("Not a Technology Number");
		}
					
			
	}
}