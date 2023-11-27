package BasicPrograms;

class DIM
{
	public static void main(String args[])
	{
		int x=2;
		int year=2008;
			
			if(x==1||x==3||x==5||x==7||x==8||x==10||x==12)
					System.out.println("31 DAYS");
			else if(x==2)
				{
					if((year%4==0 && year%100!=0)||(year%400==0))
						System.out.println("29 DAYS");
					else
						System.out.println("28 DAYS");	
				}
			else if(x==30)
				System.out.println("30 DAYS"); 
			else
				System.out.println("Invalid Input");	 
			
	}
}
			
		


/*	break;
			case 2 : if(year==Leap)
					System.out.println("Leap year Feb have 29 days");
				else
					System.out.println("FEB HAS 28 DAYS");
			break;
			case 3 : System.out.println("MAR HAS 31 DAYS");
			break;
			case 4 : System.out.println("APR HAS 30 DAYS");
			break;
			case 5 : System.out.println("MAY HAS 31 DAYS");
			break;
			case 6 : System.out.println("JUN HAS 30 DAYS");
			break;
			case 7 : System.out.println("JUL HAS 31 DAYS");
			break;
			case 8 : System.out.println("AUG HAS 31 DAYS");
			break;
			case 9 : System.out.println("SEP HAS 30 DAYS");
			break;
			case 10 : System.out.println("OCT HAS 31 DAYS");
			break;
			case 11 : System.out.println("NOV HAS 30 DAYS");
			break;
			case 12 : System.out.println("DEC HAS 31 DAYS");
			break;
			default : System.out.println("Invalid Input");
		}
	}
}	*/