package newwproj;
class Bank
{
final int interest=14;
	void getinterest()
	{
		// interest=50;
		System.out.println("it is parent class bank interset = "+interest);
	}
}
	class axis extends Bank
	{
		void getinterest()
		{
		System.out.println("it is child class 001 ");
	
		}
	}
	class hdfc extends Bank
	{
		void getinterest()
		{
			System.out.println("hdfc bank child class two");
		}
		
	}
public class OverriteMethod {

	public static void main(String[] args) {

		Bank B=new Bank();
		B.getinterest();
		hdfc h=new hdfc();
		h.getinterest();
		axis a=new axis ();
		a.getinterest();

		

	}

}
