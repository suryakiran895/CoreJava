package BasicPrograms;

import java.util.Scanner;	// reverse 12 is -->21 , 21 square is 441 and reverse of 441 ---> 144 which is equals to 12 square 
class Alien
{
	public static void main(String args[])
	{
		int num, Rev_num=0, S_num=0, Rev_Snum=0, rem=0 ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = s.nextInt();
		S_num=num*num;	// Math.pow(num,2)
		for(;num>0;num/=10)
		{
			rem = num%10;
			Rev_num = Rev_num * 10 + rem;
		}
		for(;S_num>0;S_num/=10)
		{
			rem = S_num%10;
			Rev_Snum = Rev_Snum*10+rem;
		}
		
		if((Rev_num*Rev_num)==Rev_Snum)
			System.out.println("Alien Number");
		else
			System.out.println("Not Alien Number");
	}
}