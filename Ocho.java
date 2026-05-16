//Promedio de un array
//Calcular el promedio de todos los números de un array.

public class Ocho {
	public static void main(String[] args) {
		int[] array = {2,6,4,7,2,2,8,10};
		int sumaTotal = 0;

		for(int i=0; i<array.length; i++) {
			sumaTotal += array[i];
		}

		double promedio = (double) sumaTotal / array.length;
		System.out.println(promedio);
	}
}
