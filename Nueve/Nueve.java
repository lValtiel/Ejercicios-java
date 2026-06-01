//Sumar elementos de un array
//Sumar todos los valores de un array.

public class Nueve {
	public static void main(String[] args) {
		int[] array = {2,5,4,7,3,-1,7};
		int sumaTotal = 0;

		for(int i=0; i<array.length; i++) {
			sumaTotal += array[i];
		}

		System.out.println("La suma total del array es: " + sumaTotal);
	}
}
