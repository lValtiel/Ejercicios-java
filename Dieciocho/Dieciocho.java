//Validar paréntesis
//Verificar si ()[]{} están balanceados.

public class Dieciocho {
	public static void main(String[] args) {
		String parentesis = "()[]{}";
		String pila = "";
		boolean balanceado = true;

		for(int i=0; i<parentesis.length(); i++) {
			
			char actual = parentesis.charAt(i);

			if(actual == '(' || actual == '[' || actual == '{') {
				pila += actual;
			}
			else if(actual == ')' || actual == ']' || actual == '}') {
				
				if(pila.length() == 0) {
					balanceado = false;
					break;
				}

				char ultimo = pila.charAt(pila.length() - 1);

				if(
					actual == ')' && ultimo == '(' ||
					actual == ']' && ultimo == '[' ||
					actual == '}' && ultimo == '{'
				  ) {

					pila = pila.substring(0, pila.length() - 1);
				}else {
					balanceado = false;
					break;
				}
			}
		}

		if(pila.length() > 0) {
			balanceado = false;
		}

		if(balanceado) {
			System.out.println("Balanceado");
		}else {
			System.out.println("No balanceado");
		}
	}
}
