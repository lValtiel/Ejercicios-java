//Merge de arrays ordenados
//Combinar dos arrays ordenados en uno también ordenado.

import java.util.Arrays;

public class Diecisiete {
	public static void main(String[] args) {
		int[] arrayUno = {1,3,5};
		int[] arrayDos = {2,4,6};
		int[] arrayCombinada = new int[arrayUno.length + arrayDos.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while(i < arrayUno.length && j < arrayDos.length) {
			
			if(arrayUno[i] < arrayDos[j]) {

				arrayCombinada[k] = arrayUno[i];
				i++;
			}else {
				arrayCombinada[k] = arrayDos[j];
				j++;
			}

			k++;
		}

		while(i < arrayUno.length) {

			arrayCombinada[k] = arrayUno[i];
			i++;
			k++;
		}

		while(j < arrayDos.length) {

			arrayCombinada[k] = arrayDos[j];
			j++;
			k++;
		}

		System.out.println(Arrays.toString(arrayCombinada));
	}
}
