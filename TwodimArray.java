package Binarysearchalgoithm;

import java.util.Scanner;

public class TwodimArray
{
Scanner sc=new Scanner(System.in);
int row,column;
void Two2Array()

{

	int arr[][]= {{1,2,3},{2,5,7},{4,9,0}};
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arr[i][j]+"");
		}
		System.out.println();
	}
}
void addarray()
{
	System.out.println("This is Two dim matrix Array");
	System.out.print("enter the matrix rows");
	row=sc.nextInt();
	System.out.println("enter the column");
	column=sc.nextInt();
	int arr1[][]=new int [row][column];
	int arr2[][]=new int [row][column];
	int i,j;
	System.out.print("enter the first matrix array");
	for(i=0;i<row;i++)
	{
		for( j=0;j<column;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
	}
		System.out.print(" The matrix ");
		for(i=0;i<row;i++)
		{
			for( j=0;j<column;j++)
			{
				System.out.print(arr1[i][j]+"");
			}
			System.out.println();
	  }
	
System.out.print("enter the second matrix array");
for(i=0;i<row;i++)
{
	for( j=0;j<column;j++)
	{
		arr2[i][j]=sc.nextInt();
	}
}
	System.out.print(" The matrix ");
	for(i=0;i<row;i++)
	{
		for( j=0;j<column;j++)
		{
			System.out.print(arr2[i][j]+"");
		}
		System.out.println();
  }

int sum[][]=new int [row][column];

	System.out.println("Addition of two matrices : ");
	for(i=0;i<row;i++)
	{
		for( j=0;j<column;j++)
		{
			 sum[i][j]=arr1[i][j]+arr2[i][j];
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Subtraction of two matrices : ");
	for(i=0;i<row;i++)
	{
		for( j=0;j<column;j++)
		{
			 sum[i][j]=arr1[i][j]-arr2[i][j];
			System.out.print(sum[i][j]+  " ");
		}
		System.out.println();
	}
	System.out.println("Multiplication of two matrices : ");
	for(i=0;i<row;i++)
	{
		for( j=0;j<column;j++)
		{
			 sum[i][j]=arr1[i][j]*arr2[i][j];
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
	double sum1[][]=new double [row][column];
	System.out.println("Division of two matrices : ");
	for(i=0;i<row;i++)
	{
		for( j=0;j<column;j++)
		{
			 sum[i][j]=arr1[i][j]/arr2[i][j];
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		TwodimArray t=new TwodimArray();
	//	t.Two2Array();
t.addarray();
	}

}
