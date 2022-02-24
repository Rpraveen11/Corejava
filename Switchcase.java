package newwproj;

import java.util.Scanner;

public class Switchcase {
	Scanner sc=new Scanner(System.in);
	void switchcase()
	{
		int ch;
		System.out.println("Enter your choice :");
		ch=sc.nextInt();
		
		switch (ch)
		{
		case 1:
			System.out.println("red ");
			break;
		case 2:
			System.out.println("blue  ");
			break;
		
		case 3:
			System.out.println("green ");
			break;
		
		case 4:
			System.out.println("yellow ");
			break;
		
		case 5:
			System.out.println("black ");
			break;
		default:
			
			System.out.println("invalid color choice");
		
		}
	}
	void hotel()
	{
		int h;
		System.out.println("1.South indian food");	
		System.out.println("2.karnataka food");	
		System.out.println("3.kerala food");	
		System.out.println("Enter your choice :");
		h=sc.nextInt();
		switch (h)
		{
		case 1:
			System.out.println("idli");
			System.out.println("dosa");
			System.out.println("vada");
			break;
		case 2:
			System.out.println("chapati");
			break;
		case 3:
			System.out.println("puttu");
			System.out.println("kizhangu");
		}
	}
	void arithmetic()
	{
		int a,b,c,d;
		System.out.println("enter A : ");
		a=sc.nextInt();
		System.out.println("enter B : ");
		b=sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("Enter your option : ");
		c=sc.nextInt();
		switch (c)
		{
		case 1:
		d=a+b;
		System.out.println("1.addtion ans :"+d);
		break;
		case 2:
			d=a-b;
			System.out.println("2.Subtraction ans :"+d);
			break;
		case 3:
			d=a*b;
			System.out.println("3.mul ans :"+d);
			break;
		case 4:
			d=a/b;
			System.out.println("4.Divison ans :"+d);
			break;
			default:
				System.out.println("Nothing to perform");
				
		}
	}

	public static void main(String[] args) 
	{
		Switchcase s=new Switchcase ();
		//s. switchcase();
		//s.hotel();
s. arithmetic();
	}

}
