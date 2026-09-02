package Ejercicios.AyP_II.TP_1;

import java.util.Scanner;

class Alumno {
	public String nombre;
	public int edad;
	public double nota;
}

/**
 * Gestion alumnos
 * 
 * Crear un programa para administrar información de 15 alumnos. Cada
 * alumno tiene un nombre, una edad y una nota. El programa debe permitir
 * ingresar datos en registros
 * y luego mostrar la suma de todas las notas.
 * 
 * @author UNSAdA
 */
public class GestionAlumnos {
	Scanner in;
	Alumno[] alumnos;
	int size = 2;

	/**
	 * Calculadora
	 */
	public GestionAlumnos() {
		in = new Scanner(System.in);
		alumnos = new Alumno[size];

		System.out.println("Ingrese a los " + size + " alumnos");

		for (int i = 0; i < size; i++) {
			System.out.println("Ingrese la informacion del alumno");

			alumnos[i] = new Alumno();

			System.out.print("Nombre: ");
			alumnos[i].nombre = in.nextLine();

			System.out.print("Edad: ");
			alumnos[i].edad = in.nextInt();

			System.out.println("Nota: ");
			alumnos[i].nota = in.nextDouble();

			in.nextLine();
		}

		System.out.println("La suma de todos los alumnos es: " + suma());
		in.close();
	}

	/**
	 * Suma
	 */
	public double suma() {
		double sumaTotal = 0;
		for (int i = 0; i < size; i++) {
			sumaTotal += alumnos[i].nota;
		}

		return sumaTotal;
	}
}
