package javaProgramme;

public class Stringmethods {

	public static void main(String[] args) {
		
		//Methods
		//lenght
		//concatination
		//equals and equalIgnoreCase
		//contains
		//substring
		//replace
		
		
		String s ="welcome";
		
		System.out.println(s.length());
		
		//Concatination
		
		String s1="welcome to ";
		String s2 ="training";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Welcome to ".concat(s2));
		System.out.println("Welcome to ".concat("training"));
		
		//equals and equalIgnoreCase
		
		String s3 ="WELCOME";
		String s4 = "welcome";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains
		
		System.out.println(s3.contains("W")); //case sensitive
		
		//substring
		//substring(starting index,ending index)
		
		System.out.println(s4.substring(0,3));
		System.out.println(s4.substring(2,6));
		
		//replace
		
		System.out.println(s4.replace('e','a'));
		System.out.println(s4.replace("welcome","gather"));
		System.out.println(s4.replace("come","gather"));
		

	}

}
