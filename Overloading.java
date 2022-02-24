package newwproj;

public class Overloading 
{
void get(int id,String empname)
{
	System.out.println("employee id :"+id);
	System.out.println("employee name :"+empname);
}
int gett(int a,String b)
{
	System.out.println("employee id :"+a);
	System.out.println("employee name :"+b);
	return 0;
}
	public static void main(String[] args) {
		Overloading o=new Overloading ();
		o.get(11,"praveen");
o.gett(10,"cr");
	}

}
