package BasicPrograms;
/* 					//D: Sat 4th Mar
//swap the below numbers
//input : 10 20 30 40 50 60 
//output: 30 40 10 20 50 60
class SwapDelete
{
	public static void main(String args[])
	{
		int x,y,temp;
		int arr[]=new int[]{10,20,30,40,50,60};
		System.out.println("Before Swapping of an Array");
		for(int abc: arr)
			System.out.print(abc+" ");
		for(x=0;x<2;x++)
		{
				temp=arr[x+2];
				arr[x+2]=arr[x];
				arr[x]=temp;
		}
		System.out.println("\nArray elements after swapping");
		for(int abc:arr)
			System.out.print(abc+" ");
	}
}
*/
//check two arrays are equal are not
//arr = 1 2 3 4	& arr1 = 4 3 2 1	//prove arr==arr1 or arr!=arr1
class _2ArraysEoN
{
	public static void main(String args[])
	{
		int x,y,count=1,digit=0,z=0;
		int arr[] = new int[]{1,2,1,3,4,5};
		int arr2[] = new int[]{1,3,2,1,5,4};
		System.out.println("First Array");
		for(int abc:arr)
			System.out.print(abc+" ");
		System.out.println("\nSecond Array");
		for(int abc:arr2)
			System.out.print(abc+" ");
		for(x=0;x<arr.length;x++)		//0//1//2//3		
		{
			count=0;digit=0;		//1&0	
			for(y=0;y<arr2.length;y++)	//0	
			{
				if(arr[x]==arr[y])
					count++;	//2//1//2//1
				if(arr[x]==arr2[y])		
					digit++;	//2//1//2//1	
			}
			if(count==digit)			
				z++;			//1//2//3//4		
		}
		if(z==arr.length)
			System.out.println("\nTwo arrays are equal");
		else
			System.out.println("\nTwo arrays are not equal");
	}
}
/*		for(int temp:arr)
		{
			for(int temp1:arr2)
			{
				if(temp==temp1)
					count++;
			}
		}	
*/	
/*		if(arr.length==arr2.length&&count==arr.length)
			System.out.println("\nTwo Arrays are Equal");
		else
			System.out.println("\nTwo Arrays are Not Equal");
	}
}
*/
/*

import java.util.Scanner;
class ArrayEleInsert
{
	public static void main(String args[])
	{
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = s.nextInt();
		System.out.println("Enter the Array Elemets");
		int arr[]=new int[size];
		for(x=0;x<size-1;x++)
			arr[x]=s.nextInt();
		System.out.println("Array Elements");
		for(x=0;x<arr.length-1;x++)
			System.out.print(arr[x]+" ");
		System.out.println("\nEnter the index position you want to insert the ele");
		int index=s.nextInt();
		System.out.println("Enter the element");
		int ele=s.nextInt();
		for(x=arr.length-1;x>index;x--)
			arr[x]=arr[x-1];
		arr[x]=ele;
		System.out.println("Array after insertion of "+ele+" element");
		for(int temp:arr)
			System.out.print(temp+" ");
	}
}

*/








		
		