//Invertir un String
//Dado un string, invertir el orden de los caracteres.
//Ej: "hola" → "aloh"

public class Uno {
	public static void main(String[] args) {
		String texto = " sd";
		String textoInvertido = "";

		if(texto.length() <= 0) {
			System.out.println("El texto está vacío");
		}

		for(int i=texto.length()-1; i>=0 && i<texto.length(); i--) {
			textoInvertido += texto.charAt(i);
		}

		System.out.println(textoInvertido);
	}
}
