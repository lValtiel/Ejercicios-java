//Invertir palabras de una frase
//Ej: "hola mundo" → "mundo hola"

public class Veinticuatro {
	public static void main(String[] args) {
		String texto = " hola mundo     java";
		String textoInvertido = "";
		String palabra = "";

		for(int i=texto.length() - 1; i>=0; i--) {
			
			if(texto.charAt(i) != ' ') 
			{	
				
				palabra = texto.charAt(i) + palabra;

			}
			else 
			{
				if(!palabra.equals("")) 
				{
					textoInvertido += palabra + " ";
					palabra = "";
				}

			}
		}

		if(!palabra.equals("")) 
		{		
			textoInvertido += palabra;
		}

		System.out.println(textoInvertido);
	}
}
