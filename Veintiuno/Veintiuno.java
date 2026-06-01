//Número primo
//Verificar si un número es primo.

public class Veintiuno {
	public static void main(String[] args) {
		int numero = 6;
		boolean esPrimo = true;

		if(numero <= 1) {
			esPrimo = false;
		}

		for(int i=2; i<numero; i++) {
			
			if(numero % i == 0) {
				esPrimo = false;
				break;
			}	
		}

		if(esPrimo) {
			System.out.println("El número " + numero + " SI es primo");
		}else {
			System.out.println("El número " + numero + " NO es primo");
		}
	}
}
