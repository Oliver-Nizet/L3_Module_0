package IntroToArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> s = new ArrayList<String>();
		//2. Add five Strings to your list
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for (String var : s) {
			System.out.println(var);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 1; i < s.size(); i+=2) {
			System.out.println(s.get(i));
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for (int i = s.size()-1; i > -1; i--) {
			System.out.println(s.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).contains("e")) {
				System.out.println(s.get(i));
			}
		}
		System.out.println("\n");
	}
}
