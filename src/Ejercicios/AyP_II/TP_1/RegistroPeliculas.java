package Ejercicios.AyP_II.TP_1;

import java.util.Scanner;

class Pelicula {
	String titulo;
	String director;
	int calificacion;
}

/**
 * Registro peliculas
 * 
 * Crear un programa para llevar un registro de 20 películas. Cada película
 * tiene un título, un director y una calificación. El programa debe permitir
 * ingresar información sobre
 * las películas y luego mostrar el nombre de las 2 películas con mayor
 * calificación
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

			System.out.print("Titulo: ");
			pelicula.titulo = in.nextLine();

			System.out.print("Director: ");
			pelicula.director = in.nextLine();

			System.out.print("Calificacion: ");
			pelicula.calificacion = in.nextInt();

			// Limpiar para la siguiente iteracion
			in.nextLine();
		}

		// Las dos peliculas con mayor calificacion
		Pelicula[] pelis = peliculasConMayorCalificacion();

		System.out.println("Pelicula con mayor calificacion");
		mostrarPeli(pelis[0]);

		System.out.println("Segunda pelicula con mayor calificacion");
		mostrarPeli(pelis[1]);
	}

	/**
	 * Mostrar pelicula
	 * 
	 * @return
	 */
	public void mostrarPeli(Pelicula peli) {
		System.out.println("Pelicula: " + peli.titulo);
		System.out.println("Director: " + peli.director);
		System.out.println("Calificacion: " + peli.calificacion);
	}

	/**
	 * Conseguir las dos peliculas con mayor calificacion
	 */
	public Pelicula[] peliculasConMayorCalificacion() {
		Pelicula[] pelis = new Pelicula[2];

		for (int i = 0; i < peliculas.length; i++) {
			Pelicula peli = peliculas[i];
			Pelicula mayorActual = pelis[0];
			Pelicula segundaMayor = pelis[1];

			// Mayor a la actual
			if (peli.calificacion > mayorActual.calificacion) {
				// Sobreescribir la segunda mayor
				pelis[1] = pelis[0];

				// Ahora sobreescribir la mayor
				pelis[0] = peli;
			} else if (peli.calificacion > segundaMayor.calificacion) {
				// Mayor a la segunda
				pelis[1] = peli;
			}
		}

		return pelis;
	}
}
