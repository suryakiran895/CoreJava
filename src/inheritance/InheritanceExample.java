package inheritance;
class InheritanceSuper	//Super/Parent/Base class
{
	int a,b;			//instance variables of Super class
	InheritanceSuper()	//Super class Constructor
	{
		a = 10;	b = 20;
	}
	public void calSum()	//super class method
	{
		this.calSub();
		System.out.println("Addition : "+(a+b));
	}
	public void calSub()	//super class method
	{
		System.out.println("Subtraction : "+(a-b));
	}
}
public class InheritanceExample extends InheritanceSuper	//InheritanceExample class Act as Sub class & Main class
//Sub/Child/Derived class is extended/derived from Super class by using extends keyword
{
	int x,y;			//instance variables of Sub class
	InheritanceExample()	//Sub class Constructor
	{
		super();	// Used to call the super class constructor.
		//even if you dint write this statement also a default super(); statement will be called it self automatically. 
		x = 5;	y = 10;
	}
	public void calMul()	//Sub class method
	{
		System.out.println("Multiplication : "+(x*y));
	}
	public void calDiv()	//Sub class method
	{
		System.out.println("Division : "+(x/y));
	}
	public static void main(String[] args)	//Main method
	{
		InheritanceExample is =  new InheritanceExample();	
		//Object creation for sub/child/derived class.
		//by creating object for sub class we can access/aquire the properties and behaviours of sub class as well as super class. i.e., 
		is.calSum();	//aquiring super class method by using sub class object.
		is.calSub();	//aquiring super claa method by using sub class object.
		is.calMul();	//aquiring sub class method by using sub class object.
		is.calDiv();	//aquiring sub class method by using sub class object.
	}
}
