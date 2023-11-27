package BasicPrograms;

import java.util.Scanner;
import java.util.Random;
class Game
{
	int sum=0;  
	public int Dice()
	{
		Random r = new Random();
		int n1 = r.nextInt();
		int n2 = r.nextInt();
		sum = sum + n1 + n2;
		return sum;
	}
}
class GameMain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Dice Game ");
		Game g1 = new Game();
		int x = g1.Dice();
		Game g2 = new Game();
		int y = g2.Dice();
		if(x<y)
			System.out.println(" Person 2 is Win");
		else
			System.out.println(" Person 1 is Win");
	}
}
