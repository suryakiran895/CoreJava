package polymorphism;
class FinalMethodAndFinalVariableSuper
{
	final int a=5;
	final public void calSum()
	{
		System.out.println(a);
	}
}
class FinalMethodAndFinalVariableSub extends FinalMethodAndFinalVariableSuper
{
	//super.a = super.a+20;
//	public void calSum()
//	{
//		
//	}
	
}
public class FinalMethodAndFinalVariable 
{
	public static void main(String[] args) 
	{
		FinalMethodAndFinalVariableSuper fmfv = new FinalMethodAndFinalVariableSub();
		fmfv.calSum();
	}
}
