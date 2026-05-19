//Rotar array
//Mover los elementos una posición hacia la derecha o izquierda.

import java.util.Arrays;

public class Dieciseis {
	public static void main(String[] args) {
		int[] array = {1,2,3,5,6,7};
		int primero = array[0];

		for(int i=0; i<array.length - 1 ; i++) {
			array[i] = array[i + 1];
		}

		array[array.length - 1] = primero;

		System.out.println(Arrays.toString(array));
	}
}
