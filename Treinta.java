//CRUD básico en memoria
//Crear una lista de usuarios y permitir:
//agregar
//listar
//buscar
//eliminar
//usando ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Treinta {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> usuarios = new ArrayList<>();

	static {
		usuarios.add("Juan");
		usuarios.add("Pepe");
		usuarios.add("Mónica");
		usuarios.add("Topo");
	}

	public static void main(String[] args) {

		while(true) {
			menu();
		}
	}

	public static void menu() {

		System.out.println();
		System.out.println("------------------------------");
		System.out.println("- * Opciones *               -");
		System.out.println("-                            -");
		System.out.println("-  1. Agregar Usuario        -");
		System.out.println("-  2. Listar usuarios        -");
		System.out.println("-  3. Buscar usuario         -");
		System.out.println("-  4. Eliminar usuario       -");
		System.out.println("-  5. Salir                  -");
		System.out.println("-                            -");
		System.out.println("------------------------------");

		System.out.print("Ingresa una opción: ");
		int opcion = sc.nextInt();
		sc.nextLine();

		switch(opcion) {

			case 1:
				agregarUsuario();
				break;

			case 2:
				listarUsuarios();
				break;

			case 3:
				buscarUsuario();
				break;

			case 4:
				eliminarUsuario();
				break;

			case 5:
				System.out.println("Programa finalizado.");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opción inválida.");
		}
	}

	public static void agregarUsuario() {

		System.out.print("Ingresa el nombre del usuario: ");
		String nombreUsuario = sc.nextLine();

		usuarios.add(nombreUsuario);

		System.out.println("Usuario agregado.");
	}

	public static void listarUsuarios() {

		if(usuarios.isEmpty()) {
			System.out.println("No existen usuarios.");
			return;
		}

		System.out.println();
		System.out.println("Lista de usuarios:");

		for(int i = 0; i < usuarios.size(); i++) {

			System.out.println((i + 1) + ". " + usuarios.get(i));
		}
	}

	public static void buscarUsuario() {

		System.out.print("Ingresa el nombre del usuario a buscar: ");
		String nombre = sc.nextLine();

		boolean encontrado = false;

		for(String usuario : usuarios) {

			if(usuario.equalsIgnoreCase(nombre)) {

				System.out.println("Usuario encontrado: " + usuario);
				encontrado = true;
				break;
			}
		}

		if(!encontrado) {

			System.out.println("Usuario no encontrado.");
		}
	}

	public static void eliminarUsuario() {

		System.out.print("Ingresa el nombre del usuario a eliminar: ");
		String nombre = sc.nextLine();

		boolean eliminado = false;

		for(int i = 0; i < usuarios.size(); i++) {

			if(usuarios.get(i).equalsIgnoreCase(nombre)) {

				usuarios.remove(i);

				System.out.println("Usuario eliminado.");
				eliminado = true;
				break;
			}
		}

		if(!eliminado) {

			System.out.println("Usuario no encontrado.");
		}
	}
}
