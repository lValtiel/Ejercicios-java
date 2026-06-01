//Simular login simple
//Validar usuario y contraseña hardcodeados.

import java.util.Scanner;

public class Veintinueve {
	public static void main(String[] args) {
		String usuarioCorrecto = "admin";
		String passwordCorrecta = "admin123";

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese nombre de usuario: ");
		String username = sc.nextLine().toLowerCase();

		System.out.println("Ingrese contraseña: ");
		String password = sc.nextLine();

		if(username.equals(usuarioCorrecto.toLowerCase()) && password.equals(passwordCorrecta))
		{
			System.out.println("Login correcto");
		}
		else
		{
			System.out.println("Nombre de usuario y/o contraseña inválida");
		}
	}
}
