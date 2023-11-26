package constructor;

class LocalInstancesDemo
{
	String name;	int quantity,price;	double total; //Instance variables
	LocalInstancesDemo(String n, int q, int p)	//Local variables
	{
		name = n;	quantity=q;	price = p;		//Local-Instances
	}
	public void calTotal()
	{
		System.out.println(name);
		total = quantity*price;
		System.out.println(total);
	}
}
public class LocalInstances 
{
	public static void main(String[] args) 
	{
		LocalInstancesDemo li = new LocalInstancesDemo("Milk",3,30);
		li.calTotal();
	}
}
