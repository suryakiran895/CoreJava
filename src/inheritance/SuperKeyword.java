package inheritance;
class SuperKeywordSuper
{
	int x,y;	//instance variables of super class
	public SuperKeywordSuper(int x, int y)	//local variables of super class constructor
	{
		this.x = x;	this.y = y;		//local instances of super class
	}
	public void calSum()
	{
		System.out.println("Addition of "+x+"+"+y+"\t:\t"+(x+y));
	}
	public void calSub()
	{
		System.out.println("Subtract of "+x+"-"+y+"\t:\t"+(x-y));
	}
}
class SuperKeywordSub extends SuperKeywordSuper
{
	int x,y;	//instance variables of sub class
	public SuperKeywordSub()	//local variables of sub class
	{
		super(5,5);		// calling parameterized constructor of super class
		x = 10;	y = 10;	//local instances of sub class
	}
	//super.calSub(); 	* if i write this in class body why it is not executed
	public void calMul()
	{
		super.calSub();			//calling super class method
		int mul = super.x * x;	//calling super class instance variable
		   //50 = 	5	  *	10;
		System.out.println("Multiply of "+super.x+"*"+y+" :\t"+mul);
	}
}
public class SuperKeyword 
{
	public static void main(String[] args) 
	{
		SuperKeywordSub sk = new SuperKeywordSub();
		sk.calSum();
		sk.calMul();
	}
}
