//Factorial
//Calcular el factorial de un número.

public class Diecinueve {
	public static void main(String[] args) {
		int numero = 6;
		int factorial = 1;

		for(int i=1; i<=numero; i++) {
			factorial = factorial * i;
		}

		System.out.println(factorial);
	}
}
