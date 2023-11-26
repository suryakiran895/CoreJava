package constructor;
class ThisKeywordDemo
{
		String name;	int quantity,price;	double total; //Instance variables
		ThisKeywordDemo(String name, int quantity, int price)	//Local variables
		{
			this.name = name;	this.quantity=quantity;	this.price = price;		//Local-Instances
		}
		public void calTotal()
		{
			System.out.println(name);
			total = quantity*price;
			System.out.println(total);
		}
}
public class ThisKeywod 
{
	public static void main(String[] args) 
	{
		ThisKeywordDemo tk = new ThisKeywordDemo("Milk",3,30);
		tk.calTotal();
	}
}
