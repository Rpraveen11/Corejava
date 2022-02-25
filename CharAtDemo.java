package Stringproj;

public class CharAtDemo
{
	
		void charAtDemo()
		{
			String name = "Edubridge";
			char ch= name.charAt(4);  // Return the char value at the 4th index
			System.out.println(ch);
		}
		
	    void charAtDemo1()
	    {
	    	StringBuffer sb = new StringBuffer("JavaProgram");
	    	char ch = sb.charAt(5);
	    	System.out.println(ch);
	    }

	    void charAtDemo2()
	    {
	    	StringBuilder sb = new StringBuilder("JavaProgram");
	    	char ch = sb.charAt(6);
	    	System.out.println(ch);
	    }
	    
	    void indexofDemo()
	    {
	    //	int indexof (String str); //It returns the index within this string of the first specified
	    	//java a
	    	String str = "Studytonight";
	    	String substr= "     Ton   ";
	    	String str1 = "Jon";
	    	System.out.println(str.indexOf('u'));
	    	System.out.println(str.indexOf('t', 3));
	    	System.out.println(str.indexOf(substr));
	    	System.out.println(str.indexOf(substr,7));
	    	System.out.println(str.length());
	    	System.out.println(str.replace('t','T'));
	    	
	    	System.out.println("SubString :" + str.substring(5));
	    	System.out.println("SubString : "+ str.substring(3, 6));
	    	System.out.println(str.toLowerCase());
	    	System.out.println(str.toUpperCase());
	    	System.out.println(substr + str1);
	    	//system.out.println(substr.trim() + str1);;
	    
	    	String s = "Welcome to Edubridgeindia.com";
	    	boolean b = s.contains("Edubridgeindia.com");
	    	System.out.println(b);
	    	System.out.println(s.concat("hello"));
	    	System.out.println(s.endsWith("com"));
	    	System.out.println("Startswith : " + s.startsWith("com"));
	    	String date1 = String.join("/", "19", "07","2021");  // 19/07/2021
	    	System.out.println("Date = "+ date1);
	    	String time1 = String.join(":", "12", "58", "30"); // 12:58:30
	    	System.out.println("Time ="+time1);
	    	String a=" ";
	    	String c= "Demo";
	    	System.out.println(a.isEmpty());
	    	System.out.println(c.isEmpty());
	    	}
	    
	    
	
	public static void main(String[] args)
	
	{

		CharAtDemo ca= new CharAtDemo();
	       ca.charAtDemo();
	       ca.charAtDemo1();
	       ca.charAtDemo2();
	       ca.indexofDemo();
	}

}
