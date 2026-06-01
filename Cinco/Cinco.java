//Eliminar duplicados de un array
//Dado un array de enteros, crear otro sin números repetidos.

public class Cinco {
	public static void main(String[] args) {
		int[] arrayUno = {2,5,4,7,4,2};
		int[] arraySinDuplicados = new int[arrayUno.length];
		int size = 0;

		for(int i=0; i<arrayUno.length; i++) {
			boolean repetido = false;

			for(int j=0; j<i; j++) {
				if(arrayUno[i] == arrayUno[j]) {
					repetido = true;
					break;
				}
			}

			if(!repetido) {
				arraySinDuplicados[size] = arrayUno[i];
				size++;
			}
		}		
		
		for(int k=0; k<size; k++) {
			System.out.print(arraySinDuplicados[k] + " ");
		}
	}
}
