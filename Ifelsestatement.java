package newwproj;

import java.util.Scanner;

public class Ifelsestatement 
{
	int weight;
	int age;
	  Scanner sc=new Scanner(System.in);
	void bmi()
	{
		 System.out.println("Enter your weight : ");
		weight=sc.nextInt();
		 System.out.println("Enter your Age    : ");
		age=sc.nextInt();
	}
void con()
{
	if(weight>=45)
	{
		if(age>=18)
		{
			System.out.println("You are Eligible for blood Donation");
			
		}
		else
		{
			System.out.println("Your age is not suitable");
		}
	}
	else
	{
		System.out.println("your weight is not Suitable");
	}
}
	public static void main(String[] args) 
	{
		Ifelsestatement cr=new Ifelsestatement ();
		cr.bmi();
		cr.con();

	}

}
