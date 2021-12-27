package Oops;
import java.util.Scanner;
import java.util.StringTokenizer;
public class countVowelSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence: ");
		String usrStr = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(usrStr, " ");
		
		System.out.println("\nVowel count for each word in a given sentence are:\n");
		
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			
			int count = 0;
			for (int i=0;i<word.length();i++) {
				char chr = word.toCharArray()[i];
				chr = Character.toLowerCase(chr);
				if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
					count++;
				}
			}
			System.out.println("The word "+word+" has "+count+" vowels");
		}
		
	}

}
