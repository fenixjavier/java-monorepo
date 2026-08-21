package Ejercicios.Agosto2026;

import java.util.Scanner;

/**
 * # Control de stock de una librería
 * 
 * <p>
 * Una librería quiere analizar el movimiento de sus productos durante una
 * jornada.
 * Cuenta con un catálogo de 80 productos, identificados mediante un código
 * numérico
 * del 0 al 80.
 * 
 * Al finalizar el día, se dispone de la cantidad de unidades vendidas de cada
 * producto. La
 * información se carga en un arreglo, donde la posición del arreglo coincide
 * con el
 * código del producto.
 * 
 * Por ejemplo, ventas[15] representa la cantidad de unidades vendidas del
 * producto cuyo código es 15.
 * 
 * ### Se solicita desarrollar un programa que permita analizar esta información
 * y obtener:
 * 
 * a) La cantidad total de unidades vendidas durante la jornada.
 * 
 * b) El código del producto que registró la mayor cantidad de ventas.
 * 
 * c) La cantidad de productos que no registraron ninguna venta.
 * 
 * d) El promedio de unidades vendidas considerando únicamente los productos que
 * tuvieron al menos una venta.
 * 
 * e) Informar todos los códigos de productos que superaron dicho promedio.
 * 
 * f) Determinar si existe algún producto que haya vendido exactamente 50
 * unidades. En caso afirmativo, informar su código.
 * 
 * ### Preguntas para analizar:
 * 
 * * ¿Qué información representa cada posición del arreglo?
 * 
 * * ¿Necesitamos guardar el código del producto en otro lugar?
 * 
 * * ¿Cuántas posiciones tiene el arreglo?
 * 
 * * ¿Qué variables auxiliares necesitamos?
 * 
 * * ¿Cuáles de los puntos requieren recorrer el arreglo?
 * 
 * * ¿Hay algún punto que requiera recorrerlo nuevamente?
 * </p>
 * 
 * Seria mas optimo hacer todo en un solo 'for', pero no lo pide el erjecicio.
 * 
 * @author Fenix
 */
public class ControlStockLibreria {
	// TODO: Change to 80
	public int catalogSize = 3;
	public int[] catalog = new int[catalogSize];
	public Scanner in = new Scanner(System.in);
	public int total = 0;
	public int productoConMasVentas = 0;

	// Variables privadas
	private int posicion = 0;

	/**
	 * Crear clase
	 */
	public ControlStockLibreria() {
		cargarVentas();

		total = calcularTotal();
		productoConMasVentas = codigoDeProductoConMasVentas();
	}

	/**
	 * Ingresar la cantidad de un producto del catalogo
	 */
	public void ingresarCantidad() {
		System.out.print("Ingrese la cantidad del producto numero " + 1 + ": ");
		int cantidadVendida = in.nextInt();
		System.out.println("");
		catalog[posicion] = cantidadVendida;
	}

	/**
	 * Cargar ventas de libros
	 */
	public void cargarVentas() {
		// Cargar todas las ventas
		for (int i = 0; i < catalogSize; i++) {
			ingresarCantidad();
			posicion++;
		}
	}

	/**
	 * Calcular total
	 */
	public int calcularTotal() {
		int total = 0;
		for (int i = 0; i < catalogSize; i++) {
			total += catalog[i];
		}

		return total;
	}

	/**
	 * Codigo del producto con mas ventas
	 */
	public int codigoDeProductoConMasVentas() {
		int codigo = 0;
		int cantidadMayor = 0;
		for (int i = 0; i < catalogSize; i++) {
			// Ver si la cantidad es mayor
			int cantidad = catalog[i];
			if (cantidad > cantidadMayor) {
				cantidadMayor = cantidad;
				codigo = i;
			}
		}
		return codigo;
	}

	/**
	 * Cantidad de productos sin ventas
	 */
	public int cantidadDeProductosSinVentas() {
		int cantidad = 0;
		for(int i = 0; i < catalogSize; i++) {
			int vendido = catalog[i];
			if(vendido == 0) {
				cantidad++;
			}
		}
		return cantidad;
	}
}
