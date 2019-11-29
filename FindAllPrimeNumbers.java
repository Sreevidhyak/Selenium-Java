public class FindAllPrimeNumbers {

	public static void main(String[] args) {
		int range=100;
		int num = 0;
		int i = 0;
		//Empty String
		String primeNumbers = "";

		for (i = 1; i < range; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}



		//Build a logic to find all the prime numbers from 1 to 100
		
		/*
		 * Pseudo Code
		 * a) Iterate a loop with i from 1 to range
		 * b) Iterate another loop with j from 1 to i (nested loop)
		 * c) Check if i is divisible by j, if so, increase the count
		 * d) if count is 2, then print i
		 * e) Make sure that count is reset to 0 for each iteration
		 */

