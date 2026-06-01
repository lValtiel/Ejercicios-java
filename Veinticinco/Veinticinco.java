//Anagramas
//Verificar si dos palabras son anagramas.
//Ej: "roma" y "amor"

public class Veinticinco {
	public static void main(String[] args) {
		String palabraUno = "roma";
		String palabraDos = "amor";
		boolean anagrama = true;

		if(palabraUno.length() != palabraDos.length()) 
		{
			anagrama = false;
		}
		else
		{
			int[] letras = new int[256];

			for(int i=0; i<palabraUno.length(); i++) 
			{
				letras[palabraUno.charAt(i)]++;
				letras[palabraDos.charAt(i)]--;
			}

			for(int i=0; i<letras.length; i++) 
			{
				if(letras[i] != 0)
				{
					anagrama = false;
					break;
				}
			}
		}

		if(anagrama)
		{
			System.out.println("Es anagrama");
		}
		else
		{
			System.out.println("No es anagrama");
		}
	}
}
