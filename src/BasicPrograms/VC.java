package BasicPrograms;

class VC
{
	public static void main(String args[])
	{
	char x='O';
	String s = x=='A'||x=='E'||x=='I'||x=='O'||x=='U' ? x+" is a vowel" : x+" is a consonant";
	System.out.println(s);
	}
}

class VC2
{
	public static void main(String args[])
	{
	char x='E';
	String s = x!='A' && x!='E' && x!='I' && x!='O' && x!='U' ? x+" is a consonant" : x+" is a vowel";
	System.out.println(s);
	}
}