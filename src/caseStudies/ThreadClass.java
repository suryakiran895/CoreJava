package caseStudies;

public class ThreadClass extends Thread
//In thread class we have some methods like run(),start(),stop(),..
{
	public void run()	//overridden 
	{
		System.out.println("In Run Method");
	}
	public static void main(String[] args) 
	{
		ThreadClass tc = new ThreadClass();
		tc.start();
	}
}
