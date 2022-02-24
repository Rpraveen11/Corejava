package newwproj;

public class TypeCasting 
{
void narrowingtypecasting()
{
	int no=88;
	 double i=(int)no;
System.out.println(i);
System.out.println(no);
}
void wideningtypecasting()
{
	double i=90.08;
	int j=(int)i;
	System.out.println(j);
	System.out.println(i);
}
	public static void main(String[] args)
	{
		TypeCasting t=new TypeCasting ();
		
t. narrowingtypecasting();
t.wideningtypecasting();
	}

}
