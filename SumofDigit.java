package newwproj;

import java.util.Scanner;

public class SumofDigit 
{
  int no;
  Scanner sc=new Scanner(System.in);
void sum()
{
	  System.out.println("Enter The numbers : ");
	  no=sc.nextInt();
	  int sum=0;
	  while(no!=0)
	  {
		  int rem=no%10;
		  sum=sum+rem;
		  no=no/10;
	  }
	  System.out.println("sum of digits ="+sum);
	  
	  
}
  
void fact()
{
	 System.out.println("Enter The number : ");
	  no=sc.nextInt();
	  int i;
	  int fact=1;
	 
	for(i=1;i<=no;i++) 
	{
		fact=fact*i;
	}
		
	  
	  System.out.println("The factorial no is: "+fact);
	
}
	
	public static void main(String[] args) {
		SumofDigit cr=new SumofDigit ();
	cr.sum();
cr.fact();
	}

}
