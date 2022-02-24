package Binarysearchalgoithm;

import java.util.Scanner;

public class Linearsearch 
{
		public static int search(int arr[], int x)
		{
			int n = arr.length;
			for (int i = 0; i < n; i++)
			{
				if (arr[i] == x)
					return i;
			}
			return -1;
		}
	public static void main(String[] args)
	{
		
		 Scanner sc=new Scanner(System.in);
int n=6,m;
System.out.print("enter the elements array");
m=sc.nextInt();
		int arr[] = new int [n];
		for(int i=1;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x ;
		System.out.print("enter the element");
		x=sc.nextInt();

		// Function call
		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index "+ result);
	}
}


