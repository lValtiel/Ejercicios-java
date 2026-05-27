//Contar palabras
//Contar cuántas palabras tiene una frase.

public class Veintidos {
	public static void main(String[] args) {
		String texto = "hola mundo  java";
		int contador = 0;

		for(int i=0; i<texto.length(); i++) {
			
			char letraActual = texto.charAt(i);

			if(letraActual != ' ') {
				
				if(i == texto.length() - 1 || texto.charAt(i + 1) == ' ') {
					contador++;
				}
			}
		}
		
		System.out.println(contador);
	}
 }
