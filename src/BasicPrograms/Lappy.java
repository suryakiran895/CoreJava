package BasicPrograms;

import java.util.Scanner;	//Lappy Number : Take 3 digit no. and multiply it with 2 & 3 concatinate 3 numbers and check 0-9 numbers present in that big no.
class Lappy
{
	public static void main(String agrs[])
	{
		long num,num1,num2,temp=0,temp1=0,temp2=0;
		int count=0,count1=0,count2=0,rem=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		temp=num;
		num1 = num * 2;
		temp1=num1;
		for(;num1>0;num1/=10)
		{
			count1++;
		}
		num1=temp1;
		num =(int)(num * Math.pow(10,count1));
		num = num + num1;
		System.out.println(num);
		num2 = temp * 3;
		System.out.print(num2);
		temp2=num2;
		for(;num2>0;num2/=10)
		{
			count2++;
			System.out.print(count+" ");
		}
		num2=temp2;
		num = (int)(num * Math.pow(10,count2));
		num = num + num2;
		System.out.println(num);
		//temp = num;
		while(num>0)
		{
			rem =(int) (num % 10);
			switch(rem)
			{
				case 0 :	
				case 1 :	
				case 2 :	
				case 3 :
				case 4 :	
				case 5 :	
				case 6 :	
				case 7 :	
				case 8 :	
				case 9 :	
					count=count+1;	break;
				default : System.out.println("Invalid");
			}

		num/=10;		
		}
		if(count>=10)
			System.out.println("Lappy Number");
		else
			System.out.println("Not Lappy Number");
	}
}
			
			