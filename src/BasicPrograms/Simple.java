//Write a simple program on Simple Interest

class SI
{
	public static void main(String args[])
	{
		int principle = 100000, time = 5, rate=2; /* if you take floating values then you have to specify the data type as double as double */
		int si=(principle*time*rate)/100;		//si=(100000*5*2)/100
		System.out.println("Simple Interest: "+si);	//Simple Interest: 10000
	}
}
