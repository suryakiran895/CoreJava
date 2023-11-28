package BasicPrograms;

class VowCon
{
	public static void main(String args[])
	{
		char x='a';
		switch(x)
		{
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
					System.out.println("vowel");  
			break;
			default :	System.out.println("consonant");
		}
	}
}
