package BasicPrograms;

public class ArrayEDOA
{
	public static void main(String args[])
	{
		int x,temp;
		int arr[]=new int[]{10,20,30,40,50,60,70,80,90,100};
		for(x=0;x<arr.length-2;x=x++)
		{
			if(x%2==0)
			{
				if(arr[x]>arr[x+2])
				{
					temp=arr[x];
					arr[x]=arr[x+2];
					arr[x+2]=temp;
				}
			}
			if(x%2==1)
			{
				if(arr[x]>arr[x+2])
				{
					temp=arr[x];
					arr[x]=arr[x+2];
					arr[x+2]=temp;
				}
			}
		}
		System.out.println("The Array elements ");
		for(int abc:arr)//for(int y=0;y<arr.length;y++)
			System.out.print(abc+" ");//arr[y]
		
	}
}