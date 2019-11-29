public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
		String text = "madam";
		//Declare another String rev
		String rev = "";
		char[] change = text.toCharArray();
		for (int i = change.length-1; i >= 0; i--) {

			rev = rev + change[i];
		}
		if (rev.equals(text) == true) {
			System.out.println("Its a Palindrome");
		} else
		{
			System.out.println("Its not a Palindrome");
		}

			//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */

		}

	}

