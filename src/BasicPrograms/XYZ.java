package BasicPrograms;

class  XYZ
{
	public static void main(String args[])
{

		int num1 = 2, num2 = -30, num3 = 0;
String s = num1 < num2 ? ( num1 < num3 ? num1+ " is a Smallest No." : num3+ " is a Smallest No.") : num2 < num3 ? num2+" is Smallest No." : num3+" is a Smallest No.";
		
//num1=s;


System.out.println(s);
}
}