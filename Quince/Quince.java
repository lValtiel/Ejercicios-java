//Ordenar array descendente
//Ordenar un array de mayor a menor.

import java.util.Arrays;

public class Quince {
	public static void main(String[] args) {
		int[] array = {2,6,4,7,4,9,24,12};

		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[j] > array[i]) {
					
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
