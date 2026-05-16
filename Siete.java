//Encontrar el número menor
//Encontrar el número más pequeño de un array.

public class Siete {
	public static void main(String[] args) {
		int[] array = {2,6,4,-1,-7,5};
		int numeroMenor = array[0];

		for(int i=0; i<array.length; i++) {
			if(array[i] < numeroMenor) {
				numeroMenor = array[i];
			}
		}

		System.out.println(numeroMenor);
	}
}
