package newwproj;

import java.util.Scanner;

public class ScannerclassDemo 


	{
		  int empid;
		String employeename;
		  float itname;
		  double salary;
		//private Object system;
		  Scanner sc=new Scanner(System.in);
		  void emp()
		  {
			  System.out.println("enter the empid = ");
			  empid=sc.nextInt();
			  System.out.println("enter the employeename= ");
			  employeename=sc.next();
			  System.out.println("enter the itname = ");
			  itname=sc.nextFloat();
			  System.out.println("enter the salary =");
			  salary=sc.nextDouble();
			  
		  }
		  void out()
		  {
		System.out.println("empid= "+empid);
		System.out.println("employeename= "+employeename);	  
		System.out.println("itname= "+itname);	  
		System.out.println(" salary= "+ salary);	  


		  }
		  
			public static void main(String[] args) 
			{
				ScannerclassDemo st=new ScannerclassDemo();
				st.emp();
				st.out();
				
			}

		}