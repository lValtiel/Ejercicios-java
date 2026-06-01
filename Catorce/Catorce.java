//Ordenar array ascendente
//Ordenar un array de menor a mayor sin usar Arrays.sort().

import java.util.Arrays;

public class Catorce {
	public static void main(String[] args) {
		int[] array = {2,4,7,5,2,10,5};

		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
