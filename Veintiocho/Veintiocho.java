//Contar letras mayúsculas y minúsculas de un string

public class Veintiocho {
	public static void main(String[] args) {
		String texto = "hOlA munDO JAva";
		int mayusculas = 0;
		int minusculas = 0;

		for(int i=0; i<texto.length(); i++)
		{
			if(Character.isLetter(texto.charAt(i)))
			{
				if(texto.charAt(i) == Character.toLowerCase(texto.charAt(i))) {
					minusculas++;
				}
				else if(texto.charAt(i) == Character.toUpperCase(texto.charAt(i)))
				{
					mayusculas++;
				}
			}
		}

		System.out.println("Mayúsculas -> " + mayusculas);
		System.out.println("Minúsculas -> " + minusculas);
	}
}
