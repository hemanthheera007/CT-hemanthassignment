package ct_java;
import java.util.*;

public class stringexample {

		String name = "HEMANTH KUMAR";
		String s = "java standard edition";
		String s1="b.v.raju college";
		String s2 = "welcome to careertuner";
		String s3 = "careertuner";
		String s4 =  "career";
		String s5="bvrit college";
		String s6="my name is hemanth";
		Scanner d=new Scanner(System.in);
		public void Charatindex()
		{
			System.out.println("char at given index");
			System.out.println("enter the index number:");
			int a=d.nextInt();
			if(a>=0&&a<name.length())
			{
				System.out.println(name.charAt(a));
			}
			else
			{
				System.out.println("The name has "+name.length()+"characters");
			}
			
		}
		public void string1stlettercapital()
		{
			System.out.println("Given string:"+s);
			String sub = s.substring(0,1).toUpperCase();
			String sub0 = s.substring(1,5);
			String sub1 = s.substring(5,6).toUpperCase();
			String sub11 = s.substring(6,14);
			String sub2 = s.substring(14, 15).toUpperCase();
			String substr = s.substring(15);
			System.out.println("String after conversion:"+sub+sub0+sub1+sub11+sub2+substr);
		}
		public void stringcontains()
		{
			System.out.println("String:"+s2);
			System.out.println("specified sequence of char values:"+s4);
			System.out.println(s2.contains(s4));
		}
		
		public void stringends()
		{
			System.out.println("string ends with the contents of other string");
			System.out.println(s2.endsWith(s3));
		}
		public void countwords()
		{
			StringTokenizer st=new StringTokenizer(s);
			System.out.println("Given String:"+s);
			System.out.println("Total no. of words in the string:"+st.countTokens());
		}
		public void smalltocapital()
		{
			System.out.println("Given string:"+s6);
			System.out.println("String after conversion:"+s6.toUpperCase());
		}
		public void stringreplace()
		{
			//converting second occurrence of l into L from s1
			System.out.println("Given string:"+s5);
			System.out.println("String after converting:"+s5.replace("ll", "LL"));
			
		}
		public void capital()
		{
			System.out.println("given string:"+s1);
			String sub = s1.substring(4, 8).toUpperCase();
			String sub1 = s1.substring(0,4);
			String sub2=s1.substring(8);
			System.out.println("string after conversion:"+sub1+sub+sub2);
		}
		
	public static void main(String[] args) {
		stringexample obj=new stringexample();
		int b;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("1. program to get the character at the given index within the String.");
	    System.out.println("2.  Java program to convert all the words first letter into capital for given String? (String s=”java standard edition”)");
	    System.out.println("3.  Java program to  test if a given string contains the specified sequence of char values….match() 'welcome to carrertuner'" );
	    System.out.println("4. program to check whether a given string ends with the contents of another string ");
	    System.out.println("5. Count the number of words present in the given string ");
	    System.out.println("6. Print the capital letters from string ");
	    System.out.println("7. Convert the second occurrence of ‘ l ’ into  capital from “bvrit college” ");
	    System.out.println("8. Convert the word from small letter to capital letter word in  given  String ?\r\n"
	    		+ "String s =”b.v.raju college”");
	    System.out.println("9. exit ");
	    while(true)
        	 
         {
        	 System.out.println(" enter question from assignment3");  
        	 b=sc.nextInt();
         
	    switch(b)
	    {    
	    case 1: obj.Charatindex(); break;
	    case 2: obj.string1stlettercapital();break;
	    case 3: obj.stringcontains(); break;
	    case 4: obj.stringends(); break;
	    case 5: obj.countwords(); break;
	    case 6: obj.smalltocapital(); break;
	    case 7: obj.stringreplace(); break;
	    case 8:obj.capital(); break;
	    case 9: System.exit(b); break;
	    default: System.out.println("you've entered wrong question no");
			;
			
			
		}

	}
	}
}