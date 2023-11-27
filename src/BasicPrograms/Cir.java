package BasicPrograms;

class Cir
{
	public static void main(String args[])
	{
		int radius=5;
		double area=0,circumference=0;
		area = Math.PI*radius*radius;				//area=3.1415*5*5=78.525
		System.out.println("Area of the Circle: "+area);	//Area of the Circle: 78.525
		circumference=2* Math.PI *radius;					//circumference=2*3.1415*8=50.264
		System.out.println("Circumference of the Circle: "+circumference);	//Circumference of the Circle: 50.264
	

	}
}

