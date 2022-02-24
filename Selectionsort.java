package Binarysearchalgoithm;

public class Selectionsort 
{
	void sort(int arr[])
		{
			int n = arr.length;

			for (int i = 0; i < n-1; i++)
			{
				
				int sort= i;
				for (int j = i+1; j < n; j++)
					if (arr[j] < arr[sort])
						sort = j;

				int temp = arr[sort];
				arr[sort] = arr[i];
				arr[i] = temp;
			}
		}

	
		void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i]+" ");
			System.out.println();
		}

	

	public static void main(String[] args) 
	{
		
		Selectionsort  ob = new Selectionsort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
