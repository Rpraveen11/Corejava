package newwproj;

public class Copyconst 
{
 int id;
 String name;
 Copyconst(int i,String h)
  {
	 id=i;
	 name=h;
  }
 Copyconst(Copyconst s)
  {
	 id=s.id;
	 name=s.name;
  }
 void disp()
 {
	 System.out.println(+id   +name);
 }




	public static void main(String[] args) 
	{
		Copyconst c=new Copyconst(10,"Praveen");
		Copyconst c1=new Copyconst (c);
		c.disp();
		c1.disp();
		
		
	}

}