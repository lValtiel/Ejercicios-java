//Serie Fibonacci
//Mostrar los primeros N números de Fibonacci.

import java.util.Arrays;

public class Veinte {
	public static void main(String[] args) {
		int numero = 8;
		int[] arrayFibonacci = new int[numero];
		int a = 0;
		int b = 1;
		int siguiente = 0;

		arrayFibonacci[0] = a;
		arrayFibonacci[1] = b;

		for(int i=2; i<=numero-1; i++) {
			siguiente = a + b;
			arrayFibonacci[i] = siguiente;
			a = b;
			b = siguiente;
		}

		System.out.println(Arrays.toString(arrayFibonacci));
	}
}
