//Encontrar palabra más larga
//Encontrar la palabra más larga de una frase.

public class Veintitres {
	public static void main(String[] args) {
		String texto = " hola mundo  java ";
		String palabraMasLarga = "";
		int conteo = 0;
		int mayor = 0;
		int indiceMayor = 0;
		int inicioPalabra = 0;

		for(int i=0; i<texto.length(); i++) {

			if(texto.charAt(i) != ' ') {

				if(conteo == 0) {
					inicioPalabra = i;
				}

				conteo++;

				if(conteo > mayor) {
					mayor = conteo;
					indiceMayor = inicioPalabra;
				}

			}else {
				conteo = 0;
			}
		}
		
		for(int i=indiceMayor; i<indiceMayor + mayor; i++) {
			palabraMasLarga += texto.charAt(i);
		}

		System.out.println("La palabra mas larga de la frase es: '" + palabraMasLarga + "'." + " Contiene " + mayor + " letras.");
	}
}
