package BasicPrograms;
//Thu 16th Feb
/*

 *
 *  *
 *  *  *
 *  *  *  *

*/
class Pattern1
{
	public static void main(String args[])
	{
		int x=4,y=4;
		for(x=1;x<=4;x++)
		{
			for(y=x;y>=1;y--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
/*

 *  *  *  *
 *  *  *
 *  *
 *

*/
class Pattern2
{
	public static void main(String args[])
	{
		int x=4,y=4;
		for(;x>0;x--)	
		{
			for(y=x;y>0;y--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
/*

 *  *  *  *
 *        *
 *        *
 *  *  *  *

*/
class Pattern3
{
	public static void main(String args[])
	{
		int x,y;
		for(x=0;x<4;x++)	
		{
			for(y=0;y<4;y++)
			{
				if(x==0||x==3 || y==0||y==3)
					System.out.print(" * ");
				else
					System.out.print("   ");
				
			}
			System.out.println();
		}
	}
}
/*
0
2       4
6       8       10
12      14      16      18
*/
class Pattern4
{
	public static void main(String args[])
	{
		int x,y,num=0,z;
		for(x=1;x<=4;x++)	
		{
			
			for(y=1;y<=x;y++)
			{
					System.out.print((num) +"\t");
					num+=2;		
			}
			System.out.println();
		}
	}
}
/*
1       2       3       4       5
6       7       8       9       10
11      12      13      14      15
16      17      18      19      20
21      22      23      24      25
*/
class Pattern5
{
	public static void main(String args[])
	{
		int x,y,num=1;
		for(x=1;x<=5;x++)
		{
			for(y=1;y<=5;y++)
			{
				System.out.print(num+++"\t");
			}
			System.out.println();
		}
	}
}
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
class Pattern6
{
	public static void main(String args[])
	{
		int x,y;
		for(x=5;x>0;x--)
		{
			for(y=x;y>0;y--)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}
}
/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
class Pattern7
{
	public static void main(String args[])
	{
		int x,y;
		for(x=1;x<=5;x++)
		{
			for(y=5;y>=x;y--)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}
}

/* 
1
12
123
1234
123
12
1
*/
class Pattern8
{
	public static void main(String args[])
	{
		int x,y,z;
		for(x=1;x<=4;x++)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}
		for(x=3;x>0;x--)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}
}

/*
_ _ _ _ 1
_ _ _ 1 2
_ _ 1 2 3
_ 1 2 3 4
1 2 3 4 5
*/
class Pattern9
{
	public static void main(String args[])
	{
		int x,y,s;
		for(x=1;x<=5;x++)
		{
			for(s=5;s>x;s--)
			{
				System.out.print(" _ ");
			}
			for(y=1;y<=x;y++)
			{
				System.out.print(" "+y+" ");
			}
			System.out.println();
		}
	}
}
/*
_ _ _ _ 1
_ _ _ 2 1
_ _ 3 2 1
_ 4 3 2 1
5 4 3 2 1
*/

class Pattern10
{
	public static void main(String args[])
	{
		int x,y,s;
		for(x=1;x<=5;x++)
		{
			for(s=5;s>x;s--)
			{
				System.out.print(" _ ");
			}
			for(y=x;y>0;y--)
			{
				System.out.print(" "+y+" ");
			}
			System.out.println();
		}
	}
}
/*
5 4 3 2 1
_ 4 3 2 1
_ _ 3 2 1
_ _ _ 2 1
_ _ _ _ 1
*/
class Pattern11
{
	public static void main(String args[])
	{
	int x,y,s;
	for(x=5;x>0;x--)
	{
		for(s=x;s<5;s++)
		{
			System.out.print(" _ ");
		}
		for(y=x;y>0;y--)
		{
			System.out.print(" "+y+" ");
		}
		System.out.println();
		
		
	}
	}
}		

/*
     1
    1 2
   1 2 3
  1 2 3 4 	
 1 2 3 4 5
  1 2 3 4
   1 2 3 
    1 2
     1

*/

class Pattern12
{
	public static void main(String args[])
	{
		int x,y,s;
	for(x=1;x<=5;x++)
	{
		for(s=x;s<5;s++)
		{
			System.out.print(" ");
		}
		for(y=1;y<=x;y++)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}
	for(x=4;x>=1;x--)
	{
		for(s=x;s<=4;s++)
		{
			System.out.print(" ");
		}
		for(y=1;y<=x;y++)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}
	}
}
		
	









