package oops;
import java.util.Scanner;
public class CountVowelWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String usrStr = sc.next();
		
		int count = 0;
		for (int i=0;i<usrStr.length();i++) {
			char chr = usrStr.toCharArray()[i];
			chr = Character.toLowerCase(chr);
			if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
				count++;
			}
		}
		System.out.println("The word "+usrStr+" has "+count+" vowels");
	}

}
