package BasicPrograms;

class Switch
{
	public static void main(String args[])
	{
		char choice = 'A';
		int x=67,y=54,z=0;
		switch(choice)
		{
			case 'A' : z=x-y;
			System.out.println("Subtraction "+z);
			break;
			case 'C' : x=x+y;
			System.out.println("Addition "+x);
			break;
			case 68 : y+=z;
			System.out.println("ADDITON USING ASSINGNMENT OP "+y);
			break;
			case 'B' : 
			System.out.println("MUltiplication "+x*y);
			break;
			default : 
				x=0;
				y=0;
				z=0;
				System.out.println(x+y+z);

		}
	}
}

