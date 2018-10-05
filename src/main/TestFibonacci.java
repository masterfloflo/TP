package main;

import java.util.Scanner;

public class TestFibonacci {

	public static int fibo(int n) {
		if (n == 1 || n == 0)
			return 1;
		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la valeur de n :");
		int n = sc.nextInt();
		System.out.println("le " + n + "ième élèment de la suite est : " + fibo(n));

	}

}
