//FizzBuzz
//Del 1 al 100:
//múltiplos de 3 → "Fizz"
//múltiplos de 5 → "Buzz"
//ambos → "FizzBuzz"

public class Doce {
	public static void main(String[] args) {
		int numUno = 3;
		int numDos = 5;
		int contador = 1;

		while(contador <= 100) {
			if(contador % numUno == 0 && contador % numDos == 0) {
				System.out.println("FizzBuzz");
			}else if(contador % numUno == 0) {
				System.out.println("Fizz");
			}else if(contador % numDos == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(contador);
			}
			contador++;
		}	
	}
}
