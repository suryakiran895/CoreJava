package BasicPrograms;
// Accessing Order of given 3 Numbers using ifelse.
class Main
{
           public static void main (String args[])	
{
	int a=34, b=34, c=-4,x=0;
	
	if(a<b)
	{
	    if(a<c)
		{  
            	a=a;
            	if(b<c)
            	 { 
                 b=b;
                 c=c;  
                 System.out.println(a+" "+b+" "+c);
             	}
            	else
		{
                x=b;
                b=c;
                c=x;
             	System.out.println(a+" "+b+" "+c);
	     	}
        }   
        else
        {
           x=a;
           a=c;
           c=x;
           if(b<c)
           {
              b=b;
              c=c;
              System.out.println(a+" "+b+" "+c);
           }
           else
           {
               x=b;
               b=c;
               c=x;
  System.out.println(a+" "+b+" "+c);
      }
  }
               
	}
    else
    {
        x=a;
        a=b;
        b=x;
        if(b<c)
        {
           b=b;
           c=c;
           System.out.println(a+" "+b+" "+c);
        }
        else
        {
            x=b;
            b=c;
            c=x;
		if(a<b)
		{
			a=a;
			b=b;
			System.out.println(a+" "+b+" "+c);
		}
		else
		{
		x=a;
		a=b;
		b=x;    
		System.out.println(a+" "+b+" "+c);
       		}
 	}
    }
}
}