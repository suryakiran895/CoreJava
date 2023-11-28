package BasicPrograms;

class NPR
{
	public static void main(String args[])
	{
		int x=1, n=5, r=3,nfact=1,rfact=1,nrfact=1;
		double npr=0; 
		while(x<=n)
		{
			nfact = nfact * x;
			x++;
		}
		x=1;
		while(x<=r)
		{
			rfact = rfact * x;	
			x++;
		}
		x=1;
		while(x<=(n-r))
		{
			nrfact = nrfact * x;
			x++;
		}

		npr = nfact/(rfact*nrfact);
		
		System.out.println(npr);
	}
	
}
				
				