package Abstract;
interface SuperInterface
{
	public void display();
	public void withdraw();
	public void houseLoan();
}
class Sub implements SuperInterface
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("In Display Method");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("In Withdraw Method");
	}

	@Override
	public void houseLoan() {
		// TODO Auto-generated method stub
		System.out.println("In houseLoan Method");
	}
	
}
public class Interface 
{
	public static void main(String[] args) 
	{
		Sub sd = new Sub();
		sd.display();sd.withdraw();sd.houseLoan();
		SuperInterface si = new Sub();
		si.display();si.withdraw();si.houseLoan();
	}
}
