package Ejercicios.AyP_II.TP_1;

import java.util.Scanner;

class Pelicula {
	String titulo;
	String director;
	int calificación;
}

/**
 * Registro peliculas
 * 
 * Crear un programa para llevar un registro de 20 películas. Cada película
 * tiene un título, un director y una calificación. El programa debe permitir ingresar información sobre
 * las películas y luego mostrar el nombre de las 2 películas con mayor calificación
 */
public class RegistroPeliculas {
	Scanner in;
	Pelicula[] peliculas;
	int size = 2;

	/**
	 * Constructor
	 */
	public RegistroPeliculas() {
		in = new Scanner(System.in);
		peliculas = new Pelicula[2];

		System.out.println("Ingrese la informacion de " + size + " peliculas.");
		for (int i = 0; i < size; i++) {
			System.out.println("Ingrese informacion sobre la pelicula numero " + (i + 1));
			Pelicula pelicula = peliculas[i];

			System.out.println("Titulo: ");
			pelicula.titulo = in.nextLine();

			System.out.println("Director: ");
			pelicula.director = in.nextLine();

			System.out.println("Calificacion: ");
			pelicula.calificación = in.nextInt();

			// Limpiar para la siguiente iteracion
			in.nextLine();
		}
	}

	
}
