//Contar vocales
//Contar cuántas vocales tiene un string.

public class Tres {
	public static void main(String[] args) {
		String texto = "emerson";
		int conteo = 0;

		for(int i=0; i<texto.length(); i++) {

			char letra = Character.toLowerCase(texto.charAt(i));

			if(letra == 'a' ||
			   letra == 'e' ||
			   letra == 'i' ||
			   letra == 'o' || 
			   letra == 'u') {

			   	conteo++;
			}
		}

		System.out.println("El texto " + texto + " contiene " + conteo + " vocales");
	}
}
