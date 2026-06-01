//Encontrar el número mayor
//Encontrar el número más grande de un array.

public class Seis {
	public static void main(String[] args) {
		int[] array = {2,4,8,6,10,7};
		int numeroMayor = array[0];

		for(int i=0; i<array.length; i++) {
			if(array[i] > numeroMayor) {
				numeroMayor = array[i];
			}
		}

		System.out.println(numeroMayor);
	}
}
