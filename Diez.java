//Buscar un elemento
//Verificar si un número existe dentro de un array.

public class Diez {
	public static void main(String[] args) {
		int[] array = {2,4,8,6,9};
		int numero = 0;
		boolean existe = false;

		for(int i=0; i<array.length; i++) {
			if(array[i] == numero) {
				existe = true;
			}
		}

		if(existe) {
			System.out.println("El número " + numero + " SI existe en el array");
		}else {
			System.out.println("El número " + numero + " NO existe en el array");
		}
	}
}
