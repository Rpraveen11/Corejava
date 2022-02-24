package newwproj;

public class BookAggregation
{
String bookname;
int price;
Author author;

BookAggregation(String a,int b,Author author)
{
	bookname=a;
	price=b;
	this.author=author;
	
}
void print()
{
	System.out.println("Books name is :"+bookname);
	System.out.println("book price is : "+price);
	System.out.println("author name is :"+author.authorname);
	System.out.println("author name is :"+author.age);
	System.out.println("author name is :"+author.location);
}
	public static void main(String[] args)
	{
		
Author a=new Author("praveen",23,"tiruvannamalai");
BookAggregation b=new BookAggregation("kavithai",210,a);
b.print();
	}

}
