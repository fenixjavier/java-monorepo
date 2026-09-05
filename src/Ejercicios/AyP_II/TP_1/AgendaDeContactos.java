package Ejercicios.AyP_II.TP_1;

import java.util.Scanner;

class Contacto {
	String nombre;
	String tel;
	String direccion;
}

/**
 * AgendaDeContactos
 * 
 * Diseñar una agenda de contactos. Cada contacto tiene un nombre, un
 * número de teléfono y una dirección. El programa debe permitir cargar 10
 * contactos, luego de la
 * carga, pedir un nombre y si está almacenado mostrar sus datos, caso contrario
 * informar que la
 * persona no está agregada.
 */
public class AgendaDeContactos {
	Scanner in;
	int size = 2;
	Contacto[] contactos;

	/**
	 * Agenda de contactos
	 */
	public AgendaDeContactos() {
		in = new Scanner(System.in);
		contactos = new Contacto[size];
		cargarContactos();

		// Buscar contacto
		System.out.print("\nIngrese el nombre del contacto que desea buscar: ");
		String nombre = in.nextLine();

		for (int i = 0; i < size; i++) {
			Contacto con = contactos[i];

			if (con.nombre.equals(nombre)) {
				mostrarContacto(con);
				return;
			}
		}

		System.out.println("La persona no esta agregada");
	}

	/**
	 * Cargar contactos
	 */
	public void cargarContactos() {
		System.out.println("Ingrese la lista de contactos(" + size + ")");
		for (int i = 0; i < size; i++) {
			System.out.println("\nContacto numero: " + (i + 1));
			Contacto con = new Contacto();

			System.out.print("Nombre del contacto: ");
			con.nombre = in.nextLine();

			System.out.print("Numero de telefono: ");
			con.tel = in.nextLine();

			System.out.print("Direccion: ");
			con.direccion = in.nextLine();
			contactos[i] = con;
		}
	}

	/**
	 * Mostrar contacto
	 */
	public void mostrarContacto(Contacto con) {
		System.out.println("Nombre: " + con.nombre);
		System.out.println("Numero de telefono: " + con.tel);
		System.out.println("Direccion: " + con.direccion);
	}
}
