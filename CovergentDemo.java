package newwproj;



 class Coverentparent
{
	Coverentparent get()
	{
		return this;
	}
	void disp()
	{
		System.out.println("inside parent clss");
	}
}
class child extends Coverentparent
{
	child get()
	{
		return this;
	}
	void disp()
	{
		System.out.println("inside child clss");

	}
	}

public class CovergentDemo {
	

	public static void main(String[] args) 
	{
       new child().disp(); 
		 Coverentparent c1=new  Coverentparent();
	 c1.disp();		
	



	}

}
