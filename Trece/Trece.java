//Números pares e impares
//Separar números pares e impares de un array.

public class Trece {
	public static void main(String[] args) {
		int[] array = {1,5,8,4,7,5,7};
		String numerosPares = "Pares:";
		String numerosImpares = "Impares:";

		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 == 0) {
				numerosPares +=  " " + array[i];
			}else {
				numerosImpares += " " + array[i];
			}
		}

		System.out.println(numerosPares);
		System.out.println(numerosImpares);
	}
}
