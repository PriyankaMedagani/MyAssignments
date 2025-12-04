package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;  // user input

        boolean isPrime = true;  // assume number is prime

        // Iterate from 2 to n-1
        for (int i = 2; i < n; i++) {

            // Check if i divides n
            if (n % i == 0) {
                isPrime = false;   
                break;             
            }
        }

        // Print result based on divisibility
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is NOT a prime number");
        }


	}

}
