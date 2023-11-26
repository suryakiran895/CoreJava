package constructor;

import java.util.Scanner;

class ScannerClassInConstructorDemo
{
	int a , b;
	Scanner s = new Scanner(System.in);
	ScannerClassInConstructorDemo()
	{
		System.out.println("Enter any two numbers");
		a = s.nextInt();
		b = s.nextInt();
	}
	public void calSum()
	{
		System.out.println("Sum = " +(a+b));
	}
}
public class ScannerClassInConstructor 
{
	public static void main(String[] args) 
	{
		ScannerClassInConstructorDemo sc = new ScannerClassInConstructorDemo();
		sc.calSum();
	}
}
