package newwproj;

import java.util.Scanner;

public class ATMproj 
{
	void atm()
	{
		int ch,b;
		int balance=10000;
		 Scanner sc=new Scanner(System.in);
System.out.println("welcome To our ATM ");
System.out.println("Press 1 to DEposit Money ");
System.out.println("Press 2 Withdraw money ");
System.out.println("Press 3 to check balance");
System.out.println("press 4 Exit ");
ch=sc.nextInt();
switch (ch)
{
case 1:
	System.out.println("you can deposit here");
	System.out.println("how much you want deposit ");
	b=sc.nextInt();
	b=b+balance;
	System.out.println("now your balance is : "+b); 

	break;
case 2:
	int a;
	System.out.println("how much you want ");
	a=sc.nextInt();
	System.out.println("take ur cash"+a);
	balance=balance-a;
	System.out.println("balance is :"+balance);
	break;
case 3:
	System.out.println("enter your pin then your bal will display");
	System.out.println("your available balance is: "+balance);
	break;
case 4:
	System.out.println("Your transaction will exit");
	break;
	default:
		System.out.println("Nothing to performe ");
	
	
}


	}
	public static void main(String[] args) {
		
		ATMproj  a=new ATMproj ();
		a.atm();
	}

}
