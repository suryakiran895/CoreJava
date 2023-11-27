package BasicPrograms;

class Armstrong
{
	public static void main(String args[])
	{
		int num=153,rem=0,sum=0,temp=num;

		for(;num>0;num/=10)
		{
			rem=num%10;
			rem=(int)(Math.pow(rem,3));
			sum=sum+rem;
		}
		num=temp;
		if(num==sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}

//Strong number 145 = 145 after 1!+4!+5!
		