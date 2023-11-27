import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		String input;
		do
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Student Name");
			String name = s.next();
			System.out.println("Enter Student Roll Number");
			int roll = s.nextInt();
			System.out.println("Enter Student Section");
			char section = s.next().charAt(0);
			System.out.println("Enter Tution Fee");
			double fee = s.nextInt();
			System.out.print("Enter Student Marks\n Telugu = \t");
			int sub1 = s.nextInt();
			System.out.println("Hindi = \t");
			int sub2 = s.nextInt();
			System.out.println("English = \t");
			int sub3 = s.nextInt();
			System.out.println("Maths = \t");
			int sub4 = s.nextInt();
			System.out.println("Science = \t");
			int sub5 = s.nextInt();
			System.out.println("Social = \t");
			int sub6 = s.nextInt();
			double percentage, totalmarks = 120, obtainedmarks=0, concession=0;
			obtainedmarks = sub1+sub2+sub3+sub4+sub5+sub6;
			percentage = (obtainedmarks/totalmarks)*100;
			System.out.println("Total Obtained Marks = "+obtainedmarks);
			System.out.println("Total Marks = " + totalmarks);
			System.out.println("Percentage = " + percentage);
			
			concession = (percentage>=70)?((20.0/100)*fee) : ((10.0/100)*fee);
			
			System.out.println("Concession = " + concession);
			fee = fee-concession;
			System.out.println("Toatal Fee After Discount = "+fee);
			System.out.println("If you want to contine type YES or else type NO");
			input = s.next();
				
		}while(input.equalsIgnoreCase("YES"));
			System.out.println("						THANKYOU ");
	}
}