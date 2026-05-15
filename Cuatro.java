//Contar caracteres únicos
//Contar cuántos caracteres distintos tiene un string.

public class Cuatro {
	public static void main(String[] args) {
		String texto = "emerson";
		int contador = 0;	

		for(int i=0; i<texto.length(); i++) {
		
			boolean repetido = false;

			for(int j=0; j<i; j++) {
				
				if(texto.charAt(i) == texto.charAt(j)) {
					repetido = true;
					break;
				}
			}

			if(!repetido) {
				contador++;
			}
		}

		System.out.println(contador);
	}
}
