package newwproj;

import java.util.Scanner;

public class Leapyr {
	 Scanner sc=new Scanner(System.in);
int no;
void leap()
{
System.out.println("Enter the year :");
no=sc.nextInt();
if(no%4==0)
{
	if(no%400==0)
	{
		System.out.println(" the year is leap :"+no);
		
	}
	else
	{
		System.out.println("the year is leap "+no);
	}
}
	else
	{
	System.out.println("the year is not leap "+no);
}
}

	public static void main(String[] args) {
		 Leapyr y=new  Leapyr();
		 y.leap();
		// TODO Auto-generated method stub

	}

}
