package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your n?");
		int n = in.nextInt();
		boolean[] array = new boolean[n+1];
		for (int i = 2; i < n+1; i ++) {
			array[i] = true;

		}
		for (int j = 2; j <= n; j++) {
			if (array[j] == true) {
				for (int k = 0; Math.pow(j, 2)+ k*j < n+1; k++) {
					array[(int) (Math.pow(j,2)+j*k)] = false;
				}
			}
			if (array[j]== true) {
				System.out.println(j);
			}


		}

	}
}
