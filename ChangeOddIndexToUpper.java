public class ChangeOddIndexToUpper {



	public static void main(String[] args) {
		
		// Here is the input
				String test = "changeme";
				
		//Build a logic  to change the odd index to uppercase (output:cHaNgEmE)
				/* Pseudo Code: 
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) find the odd index within the loop (use mod operator)
				d) within the loop, change the character to uppercase if the index is odd else don't change
				   (use Character.toUpperCase(ch) and print without new line as System.out.print(ch);
			*/

				char[] change = test.toCharArray();

		for (int i = 0; i <change.length ; i++)
		{if (i%2!=0) {
			System.out.print(Character.toUpperCase(change[i]));
		}
else {System.out.print((change[i]));}
		}


	}

}
