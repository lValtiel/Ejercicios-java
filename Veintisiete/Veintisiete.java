//Eliminar espacios duplicados
//Convertir:
//"hola    mundo"
//"hola mundo"

public class Veintisiete {
	public static void main(String[] args) {
		String texto = "hola   mundo e    ha";
		String textoCorregido = "";

		for(int i=0; i<texto.length(); i++)
		{
			if(texto.charAt(i) != ' ')
			{	
				textoCorregido += texto.charAt(i);
			}
			else
			{
				if(i > 0 && texto.charAt(i - 1) != ' ') 
				{
					textoCorregido += " ";
				}
			}
		}

		System.out.println(textoCorregido);
	}
}
