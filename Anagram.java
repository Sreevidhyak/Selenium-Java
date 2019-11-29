import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";

		int a=text1.length();
		int b=text2.length();

			if (a==b)

		    {
			System.out.println("text1 and text 2 are equal in size");

				char[] change1=text1.toCharArray();
				char[] change2=text2.toCharArray();
				System.out.println(change1);
				System.out.println(change2);

				Arrays.sort(change1);
				Arrays.sort(change2);
				System.out.println(change1);
				System.out.println(change2);
				for (int i = 0; i < change1.length; i++) {

					if (change1[i]==(change2[i]))
					{
						System.out.println("Both the array have same value" + change1[i]);
					}

				}

		    }
			else
			{
				System.out.println("text1 and text 2 are not equal in size");
			}

			//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */

	}

}
