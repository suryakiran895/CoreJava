package BasicPrograms;

import java.util.Scanner;
/*
// Base Program						//	SAT 25th FEB 
class ArmstrongNum
{
	public static void main(String args[])
	{
		int num1=0,num2=0,temp=0,rem=0,sum=0,power=1,count=0,count2=0,add=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Range\nFrom = ");
		num1 = s.nextInt();
		System.out.print("To = ");
		num2 = s.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			temp=i;		rem = 0 ;	count=0;	sum=0;
			for(;i>0;i/=10)
			{
				count++;
			}
			//System.out.println(count);
			i=temp;
			for(;i>0;i/=10)				//153>0
			{
				rem=i%10;	power=1;	//3
				for(int x=1;x<=count;x++)	//1<=3//2<=3//3<=3
				{
					power = power * rem;	//1*3//3*3//9*3
				}
				sum=sum+power;			//0+27//
			}
			i=temp;
			if(i==sum)
			{
				System.out.println(i);
				count2++;
				add=add+i;
			}
		}
		System.out.println("Total Number of Armstrongs is : "+count2);
		System.out.println("Sum of All Armstrongs is : "+add);
	}
}
*/
//	Model 1: Return Type - void
class ArmstrongNum
{
	int num1,num2,temp,count,count1,add,sum,rem,power;
	public void rangeArm()
	{
		for(;num1<=num2;num1++)
		{
			calCount(num1);
			calPower(num1,count);
			checkArm(num1,sum);
		}
		printArm(count1,add);
	}
	public void calCount(int num)
	{
		temp = num;	sum=0;	count=0;
		for(;num>0;num/=10)
		{
			count++;
		}
		num=temp;
	}
	public void calPower(int num,int count)
	{
		for(;num>0;num/=10)
		{
			temp=num;
			rem=num%10;	power = 1;
			for(int x=1;x<=count;x++)
			{
				power=power*rem;
			}
			sum=sum+power;
			num=temp;
		}
	}
	public void checkArm(int num,int sum)
	{
		if(num==sum)
		{
			System.out.println(num);
			count1++;
			add=add+num;
		}
	}
	public void printArm(int count1,int add)
	{
		System.out.println("Total Armstrong Numbers = "+count1);
		System.out.println("Sum of All Armstrong Numbers = "+add);
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Armstrong Range\nFrom = ");
		ArmstrongNum a = new ArmstrongNum();
		a.num1 = s.nextInt();
		System.out.print("To = ");
		a.num2 = s.nextInt();
		a.rangeArm();
		}
}

/*
//	Model 1: Return Type - void
class ArmstrongNum
{
	int num,count,count1,add,sum,rem,power,temp;
	public void calCount()
	{
		temp = num;	sum=0;	count=0;
		for(;num>0;num/=10)
		{			
			count++;
		}
		num=temp;
	}
	public void calPower()
	{
		for(;num>0;num/=10)
		{
			rem=num%10;	power = 1;
			for(int x=1;x<=count;x++)
			{
				power=power*rem;
			}
			sum=sum+power;
		}
		num=temp;
	}
	public void checkArm()
	{
		if(num==sum)
		{
			System.out.println(num);
			count1++;
			add=add+num;
		}
	}
	public void printArm()
	{
		System.out.println("Total Armstrong Numbers = "+count1);
		System.out.println("Sum of All Armstrong Numbers = "+add);
	}
}
class ArmstrongNumMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Armstrong Range\nFrom = ");
		ArmstrongNum a = new ArmstrongNum();
		int n1 = s.nextInt();
		System.out.print("To = ");
		int n2 = s.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			a.num=i;
			a.calCount();
			a.calPower();			
			a.checkArm();
		}
		a.printArm();
	}
}

//Model 2:	Return Type - int
class ArmstrongNum
{
	int temp,rem,count,sum,power;
	public int calCount(int num)
	{
		temp=num;	count=0;	sum=0;	
		for(;num>0;num/=10)
		{
			count++;
		}
		num=temp;
		return count;
	}
	public int calPower(int num,int count)
	{	
			
		for(;num>0;num/=10)
		{
			temp=num;	power=1;
			rem=num%10;
			for(int x=1;x<=count;x++)
			{
				power = power * rem;
			}
			sum=sum+power;
			num=temp;
		}
		return sum;
	}
}
class ArmstrongNumMain
{
	public static void main(String args[])
	{
		int count1=0,add=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Armstrong Range\nFrom = ");
		ArmstrongNum a = new ArmstrongNum();
		int num1 = s.nextInt();
		System.out.print("To = ");
		int num2 = s.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			int x = a.calCount(i);
			int sum = a.calPower(i,x);
			if(i==sum)
			{
				System.out.println(i);
				count1++;
				add = add + i;
			}
		}
		System.out.println("Total Armstrong Numbers = "+count1);
		System.out.println("Sum of all Armstrong Numbers = "+add);
	 }
}

// Model 3: Return Type - int	// Parameters Passing
class ArmstrongNum
{
	int rem,temp,count,power,sum,add,count2;
	public int calCount(int num)
	{
		temp=num;	sum=0;	count=0;
		for(;num>0;num/=10)
		{
			count++;
		}
		num=temp;
		return count;
	}
	public int calPower(int count,int num)
	{
		temp=num;
		for(;num>0;num/=10)
		{
			rem=num%10;	power=1;
			for(int x=1;x<=count;x++)
			{
				power = power * rem;
			}
			sum=sum+power;
		}
		num=temp;
		return sum;
	}
	public String checkArm(int num,int sum)
	{
		if(num==sum)
		{
			System.out.println(num);
			count2++;
			add = add+num;
		}
		return count2+" & "+add;
	}
	public void printArm(String z)
	{
		System.out.println("Total Armstrong Numbers and Sum of all Armstrong Numbers = "+z);
		
	}
}
class ArmstrongNumMain
{
	public static void main(String args[])
	{
		String z="";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Range\nFrom = ");
		int n1= s.nextInt();
		System.out.print("To = ");
		int n2=s.nextInt();
		ArmstrongNum a = new ArmstrongNum();
		for(int i=n1;i<=n2;i++)
		{
			int x = a.calCount(i);
			int y = a.calPower(x,i);
			 z = a.checkArm(i,y);
		}
			a.printArm(z);
	}
}

*/













