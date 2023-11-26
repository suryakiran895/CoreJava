package Abstract;

abstract class SuperDemo	//abstract class
{
	public abstract void Display();	//abstract method or unimplemented method
	public abstract void Withdraw();	
	public void houseLoanInterest()	//implemented method or concrete method or non abstract method
	{
		System.out.println("Interest 10%");
	}
}
class SubDemo extends SuperDemo
{
	public void Display()
	{
		System.out.println("in Display Method");
	}
	public void Withdraw()
	{
		System.out.println("in Withdraw Method");
	}
	public void chequeCharges()
	{
		System.out.println("in cheque Charges Method");
	}
}
public class Example1 
{
	public static void main(String[] args) 
	{
			SubDemo sd = new SubDemo();
			sd.Display();	sd.Withdraw();sd.chequeCharges();
			sd.houseLoanInterest();
			SuperDemo sd1 = new SubDemo();	//Upcasting
			sd1.Display();sd1.Withdraw();sd1.houseLoanInterest();
	}
}
