package BasicPrograms;

class DuplicateElement
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,4,1,8,43,6,5,4,2,1,9,7,8,5,4,9,4,0,1};
		boolean b[]=new boolean[arr.length];
		int x,y,count;
		System.out.println("Duplicate Elements are: ");
		for(x=0;x<arr.length;x++)
		{
			count=0;
			if(b[x]==true)
				continue;
			for(y=0;y<arr.length;y++)
			{
				if(arr[x]==arr[y]&&x!=y)
				{
					b[y]=true;
					count++;
				}
			}
//			if(count>0)
//				System.out.println(arr[x]+" repeated "+count+" times");
		}
		System.out.println("Duplicate Elements are: ");
		for(x=0;x<arr.length;x++)
		{
			if(b[x]==true)
			System.out.print(arr[x]+" ");
		}
	}
}