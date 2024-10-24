package practical;
import java.util.Scanner;

public class addpn {

	public static void main(String[] args) {
		


		        Scanner sc = new Scanner(System.in);

		        // Ask the user for the value of N
		        System.out.print("Enter the value of N: ");
		        int N = sc.nextInt();

		        // Variable to store the sum
		        int sum = 0;

		        // Loop to calculate the sum of numbers from 1 to N
		        for (int i = 1; i <= N; i++) {
		            sum =sum + i; // Add each number to the sum
		        }

		        // Output the result
		        System.out.println("The sum of first " + N + " natural numbers is: " + sum);

		   
		}


	}

