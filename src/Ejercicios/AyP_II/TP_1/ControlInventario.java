package Ejercicios.AyP_II.TP_1;

import java.util.Scanner;

class Producto {
	public String nombre;
	public double precio;
	public int stock;
}

/**
 * ControlInventario
 * 
 * Desarrollar un sistema de control de inventario de productos. Cada
 * producto tiene un nombre, un precio y una cantidad en stock. El programa debe
 * permitir ingresar
 * datos de 50 productos y luego mostrar el producto con mayor stock y el
 * producto con menor precio.
 */
public class ControlInventario {
	Scanner in;
	Producto[] productos;
	int size = 2;

	/**
	 * 
	 */
	public ControlInventario() {
		in = new Scanner(System.in);
		productos = new Producto[size];

		System.out.println("Ingrese los " + size + " productos");

		for (int i = 0; i < size; i++) {
			System.out.println("----------------------");
			System.out.println("Producto numero " + i);

			productos[i] = new Producto();

			System.out.print("Nombre: ");
			productos[i].nombre = in.nextLine();

			System.out.print("Precio: ");
			productos[i].precio = in.nextDouble();

			System.out.print("Cantidad: ");
			productos[i].stock = in.nextInt();

			in.nextLine();
		}

		System.out.println();
		Producto productoMayor = productoConMayorStock();
		System.out.println("Producto con mayor stock: " + productoMayor.nombre);
		System.out.println("Su stock: " + productoMayor.stock);

		System.out.println();
		Producto productoMenorPrecio = productoConMenorPrecio();
		System.out.println("Producto con menor precio: " + productoMenorPrecio.nombre);
		System.out.println("Su precio: " + productoMenorPrecio.precio);

		in.close();
	}

	/**
	 * Producto con mayor stock
	 */
	public Producto productoConMayorStock() {
		int mayorStock = 0;
		int pos = 0;
		for (int i = 0; i < size; i++) {
			int stockActual = productos[i].stock;
			if (stockActual > mayorStock) {
				mayorStock = stockActual;
				pos = i;
			}
		}

		return productos[pos];
	}

	/**
	 * Producto con menor precio
	 */
	public Producto productoConMenorPrecio() {
		double menorPrecio = 0;
		int pos = 0;
		for (int i = 0; i < size; i++) {
			double precioActual = productos[i].precio;
			if (precioActual < menorPrecio) {
				menorPrecio = precioActual;
				pos = i;
			}
		}

		return productos[pos];
	}
}
