package Abstract;
interface A
{
	public void calSum();
	public void calSub();
	public void calDiv();
	public void calMul();
}
abstract class B implements A
{
	public void calSum()
	{
		System.out.println(10+10);	//System.err.println(); What is this
	}
	public abstract void calPrime();
	public void calSub()
	{
		System.out.println(10-5);
	}
}
public class ExtendsImplements extends B
{
	@Override
	public void calDiv() 
	{
		// TODO Auto-generated method stub
		System.out.println(10/5);
	}

	@Override
	public void calMul() {
		// TODO Auto-generated method stub
		System.out.println(5*5);
	}

	@Override
	public void calPrime() {
		// TODO Auto-generated method stub
		int count=0,x = 13;
		for(int y=2;y<=x/2;y++)
		{
			if(x%y==0)
				count++;
		}
		if(count==0)
			System.out.println("Prime");
	}
	public static void main(String[] args) 
	{
		ExtendsImplements ei = new ExtendsImplements();
		ei.calDiv();ei.calMul();ei.calSub();ei.calPrime();ei.calSum();
	}
}
