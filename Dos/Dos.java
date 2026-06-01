//Palíndromo
//Verificar si una palabra se lee igual al derecho y al revés.
//Ej: "reconocer" → true

public class Dos {
	public static void main(String[] args) {
		String texto = "reconocer";
		int ultimo = texto.length() - 1;
		boolean esPalindromo = true;
		
		for(int i=0; i<texto.length() / 2; i++) {

			if(texto.charAt(i) != texto.charAt(ultimo)) {
				esPalindromo = false;
				break;
			}else {
				ultimo--;
			}
		}

		if(!esPalindromo) {
			System.out.println(texto + " no es palíndromo");
		}else {
			System.out.println(texto + " si es palindromo");
		}
	}
}
