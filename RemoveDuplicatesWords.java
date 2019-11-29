public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
		String a="";
		String[] arr1 = text.split(" ");
		for (int i = 0; i < arr1.length; i++) {
			count = 0;
			for (int j = 0; j < arr1.length; j++) {

				if (arr1[i].equals(arr1[j]) == true) {
					count++;
				}
				if (count > 1) {
					a= text.replace(arr1[i], "");
				}

			}

			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */

		}
		System.out.println(a);

	}
}
