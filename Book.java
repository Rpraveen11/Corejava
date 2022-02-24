package newwproj;

import java.util.Scanner;

public class Book 
{
String bookname;
int price;
String autor;
Scanner sc=new Scanner(System.in);
Book(String b,int i,String a)
{
	bookname=b;
	price=i;
	autor=a;
}
void put()
{
	System.out.println(" the boook name is :"+bookname);
	
	System.out.println(" the boook price is : "+price);
	System.out.println(" the author name is :"+autor);
	
}
	public static void main(String[] args) {
		Book bc=new Book ("sathiyam",210,"Gandhi");
		bc.put();
		
		
	}

}
