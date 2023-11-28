package BasicPrograms;
//Find out area and perimeter of the rectangle.(area=l*b , perimeter=2(l+b))

class AreaR
{
	public static void main(String args[])
	{
		int length=20, breadth=10;
		int area=length*breadth;				//area=12*15=180
		System.out.println(/*"Area of the Rectangle: "+*/area);	//Area of the Rectangle: 180
	}
}

class PerimeterR
{
	public static void main(String args[])
	{
		int length=25, breadth=30;
		int perimeter=2*length+breadth;					//perimeter=2*25+30
		System.out.println("Perimeter of a Rectangle: "+perimeter);	//Perimeter of a Rectangle: 110
	}
}
