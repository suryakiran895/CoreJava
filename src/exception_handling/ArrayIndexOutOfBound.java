package exception_handling;

public class ArrayIndexOutOfBound extends Thread
{
	public void run()
	{
		try 
		{
			Thread.sleep(-7);
			System.out.println("Run Method");
			
		} 
		catch (IllegalArgumentException | InterruptedException e) 
		{
			e.printStackTrace();
			System.out.println("Run Method");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
	public static void main(String[] args)
	{
		try
		{
			int []arr = new int[] {1,2,3,4,5};
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Handled AIOOBE");
			System.out.println(ai);
		}
		ArrayIndexOutOfBound a = new ArrayIndexOutOfBound();
		a.start();
		
	}
}
