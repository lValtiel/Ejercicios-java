//Contar frecuencia de números
//Contar cuántas veces se repite cada número en un array.

public class Once {
	public static void main(String[] args) {
		int[] array = {4,6,4,8,2,7,2};

		for(int i = 0; i < array.length; i++) {

			boolean repetido = false;

			for(int j = 0; j < i; j++) {

				if(array[i] == array[j]) {
					repetido = true;
					break;
				}
			}

			if(repetido) {
				continue;
			}

			int frecuencia = 0;

			for(int j = 0; j < array.length; j++) {

				if(array[i] == array[j]) {
					frecuencia++;
				}
			}

			System.out.println(
				"El número "
				+ array[i]
				+ " se repite "
				+ frecuencia
				+ " veces"
			);
		}
	}
}
