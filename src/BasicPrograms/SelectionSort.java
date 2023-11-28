package BasicPrograms;

class SelectionSort
{
	public static void main(String args[])
	{
		int x,y,min=0;
		int arr[]=new int[]{2,4,6,1,9};
		System.out.println("Array Elements: ");
		for(int temp:arr)
			System.out.print(temp+" ");
		for(x=0;x<arr.length;x++)	//0=2
		{
			min=x;			//0
			for(y=x+1;y<arr.length;y++)//I//0+1=1//2//3//4//5
			{
				if(arr[min]<arr[y])//E//2<4//2<6//6<1//6<9
					min=y;	   //1//2//
			}
			arr[x]=arr[min]^arr[x];
			arr[min]=arr[min]^arr[x];
			arr[x]=arr[min]^arr[x];
		}			
		System.out.println("\nArray Elements After Selection Sort: ");
		for(int temp:arr)
			System.out.print(temp+" ");
	}
}