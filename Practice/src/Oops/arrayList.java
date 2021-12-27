package Oops;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList myList = new ArrayList<>(5);
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		
		int c;
		System.out.println(myList);
		for (int i=0;i<myList.size();i++) {
			c = (int)myList.get(i);
			System.out.println("\nWorking on the number "+c);
			System.out.println("Result after adding 5 to given number is: "+(c+5));
		}
	}
	
}
