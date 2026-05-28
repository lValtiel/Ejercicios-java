//Segunda mayor cantidad
//Encontrar el segundo número más grande de un array.

public class Veintiseis {
	public static void main(String[] args) {
		int[] array = {2,6,4,8,10,20,15,11,17,21};
		int mayor = Integer.MIN_VALUE;
		int segundoMayor = Integer.MIN_VALUE;

		for(int i=0; i<array.length; i++)
		{
			if(array[i] > mayor)
			{
				segundoMayor = mayor;
				mayor = array[i];
			}
			else if(array[i] > segundoMayor && array[i] < mayor)
			{
				segundoMayor = array[i];
			}
		}

		System.out.println(segundoMayor);
	}
}
