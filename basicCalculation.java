package newwproj;

import java.util.Scanner;

public class basicCalculation
{
	int no,l,b,h,s,r;
	 Scanner sc=new Scanner(System.in);
	 void square()
	 {
		 System.out.println("enter the square value :");
		 no=sc.nextInt();
		 no=no*no;
		 System.out.println(no);
		 
		 
	 }
	 void circle()
	 {
		 int area,peri;
		 System.out.println("enter the radious :");
		 r=sc.nextInt();
		 area=(int)3.14*r*r;
		 System.out.println("the area of circle is :"+area);
		 peri=(int)(2*(3.14)*r);
		 System.out.println("the peri value        :"+peri);
	 }
	public static void main(String[] args) 
	{
		 basicCalculation cr=new  basicCalculation();
	 cr.square();
	
cr.circle();
	}

}
