package Binarysearchalgoithm;

public class Binarysrch2 
{
static void Binarysearch(int arr[],int first,int last,int key)
{
	int mid=(first+last)/2;
while(first<=last)
{
	if(arr[mid]<key)
	{
	first=mid+1;
    }

else if(arr[mid]==key)
{
	System.out.println("Element is found at index : "+mid);
	break;
}
else
{
	last=mid-1;
}
	mid=(first+last)/2;
	}
if(first>last)
{
	System.out.println("Element is not present!!");
}

}
	public static void main(String[] args) 
	{
int arr[]= {10,20,30,40,50,60,70};
int key=60;
int last=arr.length-1;
Binarysearch(arr,0,last,key);

	}

}
