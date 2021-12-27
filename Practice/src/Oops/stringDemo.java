package Oops;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nMethods of Strings");
		
		//length
		System.out.println("\nLength Method");
		String sl = new String("Hello World!");
		System.out.println(sl.length());
		
		//substring
		System.out.println("\nSubString");
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		//compare,equal,
		System.out.println("\nCompare & Equal");
		String s1 = "Hello";
		String s2 = "HELLO";
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
		//isEmpty
		System.out.println("\nIsEmpty");
		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		
		//toLowerCase
		System.out.println("\nTo Lower case");
		String s4 = "HELLO";
		System.out.println(s4.toLowerCase());
		
		//Replace
		System.out.println("\nReplace");
		String s5 = "Heddo";
		System.out.println(s5.replace('d','l'));
		
		//StringBuffer
		System.out.println("\nStringBuffer");
		StringBuffer s = new StringBuffer("Welcome to Java!");
		System.out.println(s);
		s.append(" Enjoy your Learning!");
		System.out.println(s);
		
		//Insert
		System.out.println("\nInsert");
		s.insert(1,'E');
		System.out.println(s);
		
		//Replace
		s.replace(0,4,"Wel");
		System.out.println(s);
		
		//Delete
		s.delete(0,3);
		System.out.println(s);
		
		//StringBuilder
		System.out.println("\nCreating StringBuilder");
		StringBuilder sb = new StringBuilder("Happy");
		sb.append(" Learning");
		System.out.println(sb);
		System.out.println(sb.delete(0, 6));
		System.out.println(sb.insert(0, "Great"));
		System.out.println(sb.reverse());
		
		//Conversion
		
		System.out.println("\nConversion of Strings to StringBuffer and StringBuilder");
		String str = "Hello";
		StringBuffer sbr = new StringBuffer(str);
		System.out.println(sbr.append(" World"));
		System.out.println(sbr.reverse());
		
		System.out.println("\nString Object to StringBuilder");
		StringBuilder sbl = new StringBuilder(sbr);
		System.out.println(sbl.reverse());
		
	}

}
