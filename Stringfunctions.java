package Stringproj;

public class Stringfunctions
{

	
	 // User define class

	
	   // Length()= It return count of the total number of character 
		void LengthDemo()
		{
			System.out.println("-----LegthDemo-------");

			String str = "EduBridge"; // By Literal method.
			System.out.println("lenght of str="+str.length());
		}
		
		/*REPLACE():
		 * 1. Replace (Char old char, New char)
		 * 2. Replace (charSequence target, CharSequence replacement)
		 * The Second replacement method is added since JDK 1.5
		 * old char : Old character 
		 * new char : New Character
		 * target : target Sequence of characters 
		 * replacement : Replacement sequence of character  */
		void Replacement ()
		{
			System.out.println("-----Replacement-------");

			//System.out.println("StringFunction.replaceDemo()");
			String str1= "My name is Praveen, My course is JavaFullStack";
			System.out.println(str1);
			String replaceStr= str1.replace("My"," Your");
			System.out.println(replaceStr);
		}
		
		// Split(): To split the string. 
		void splitDemo()
		{		
			System.out.println("-----SplitDemo-------");
	          String str= "Hello how are you ?" ;
			// String words[] = str.split( " " );
			for ( String i:str.split("\\s", 0)) // Splits the string based on whitespace
			{
				System.out.println(i);
			}
		}
		
		// SubString() : It returns part of String 
		void subStringDemo()
		{
			System.out.println("-----SubStringDemo-------");
			String str = "Edubridge";
			System.out.println(str.substring(0,3));
		}
		
		// toLowercase () : Convert  from upper Case to Lowercaser
		void lowercase()
		{		System.out.println("--------Lowercase-------");

			String str = "EDUBRIDGE";
			System.out.println(str.toLowerCase());
		}
		
		// ToUpperCase () : Convert  from Lower Case to Uppercase
		void Uppercase()
		{
			System.out.println("------------UpperCase-----------");
			String str = "edubrigde";
			System.out.println(str.toUpperCase());
		}

		// Trim(): Eliminates leading and trailing space.
		void trim()
		{
			System.out.println("---------Trim-----------");
			String str = "          Hello boys             ";
			System.out.println(str+"How r u ?");
			System.out.println(str.trim()+ "How r u ?");
		}
		
		// valueof(): Convert Different types of value into String 
		// Like u can convert into the string , long to string , Boolean to string , Character to string ,
		// float to String , double to String, object to string, char array to string. 
		
		void ValueOf()
		{
			System.out.println("--------Valueof-------------");
			int no= 10;
			char ch = 'b';
			String str= String.valueOf(no);
			System.out.println(str);
		}
		void equalsOperator()
		{
			System.out.println("-------EQUALS OPERATIONS-------------");
			String s1= "Edubrigde";
			String s2= "Edubrigde";
			String s3= new String("Edubrigde");
			System.out.println(s1==s2);// true bcoz both refer to same instance 
			System.out.println(s2==s3);//false bcoz s3 refer to instance created in nonpool
		
	}
	public static void main(String[] args)
	{
	
		
		Stringfunctions sf= new Stringfunctions();
	      sf.LengthDemo();
	      sf.Replacement();
	      sf.splitDemo();
	      sf.subStringDemo();
	      sf.lowercase();
	      sf.Uppercase();
	      sf.trim();
	      sf.ValueOf();
	      sf.equalsOperator();
	}

}
