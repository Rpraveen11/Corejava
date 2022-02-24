package newwproj;

import java.util.Scanner;


public class Swapping {
	int no1,no2,no3;
	Scanner sc=new Scanner(System.in);
	void withouttemp()
	{
		System.out.println("Enter the No1 value : ");
		no1=sc.nextInt();

		System.out.println("Enter the No2 value : ");
		no2=sc.nextInt();
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		
		
		System.out.println("After swapping :"+no1  +no2);
		System.out.println();
		
	}

void withtemp()
{
	System.out.println("Enter the No1 value : ");
	no1=sc.nextInt();

	System.out.println("Enter the No2 value : ");
	no2=sc.nextInt();
	no3=no1;
	no1=no2;
	no2=no3;
	
System.out.println("After swapping :"+no1  +no2);
}
	
void Fibonacii()
{
	int no1=0,no2=1,no3;
	int i,n;
	System.out.println("Enter the n time loop you want : ");
	n=sc.nextInt();
	System.out.println(no1);
	System.out.println(no2);
	for(i=1;i<=n;i++)
	{
		no3=no1+no2;
		System.out.println(no3);
		no1=no2;
		no2=no3;
		
	}
}
	
	public static void main(String[] args) {
		 Swapping cr=new  Swapping();
		//r.withouttemp();
		 //cr.withtemp();
		 cr.Fibonacii();
		

	}

}
