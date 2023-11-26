package Abstract;
interface SuperInterface1
{
	public void calEven();
	public void calOdd();
}
interface SuperInterface2
{
	public void sumOfTenDigits(); 
}
public class MultipleInheritance implements SuperInterface1,SuperInterface2
{

	@Override
	public void sumOfTenDigits() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calEven() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calOdd() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		MultipleInheritance mi = new MultipleInheritance();
		mi.calEven();	mi.calOdd();mi.sumOfTenDigits();
	}
}
