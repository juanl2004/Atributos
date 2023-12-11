package ejercicio2;

import java.util.Scanner;

public class MainEj2 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// LLamamos a la función pideAncho, para solicitar el valor del ancho al usuario
		double ancho = pideAncho();
		// Llamamos a la función pideAlto, para solicitar el valor de la altura al
		// usuario
		double alto = pideAlto();

		// Llamamos a la clase "rectangulo" con los valores de ancho y alto
		Rectangulo rectangulo = new Rectangulo(ancho, alto);

		int opcion;
		// Bucle hasta que el usuario elija salir (opción 0)
		do {
			// LLamamos a la función menu
			opcion = menu();

			// Realizar acciones según la opción seleccionada
			switch (opcion) {
			case 1:
				// En el caso 1 imprimimos el perimetro llamando a la función perimetro
				System.out.println("Perímetro --> " + rectangulo.perimetro());
				// Cierre
				break;
			case 2:
				// En el caso 2 imprimimos el area llamando a la función area
				System.out.println("Área --> " + rectangulo.area());
				// Cierre
				break;
			case 0:
				// En el caso 0 imprimimos "Saliendo del programa"
				System.out.println("Saliendo del programa...");
				// Cierre
				break;
			default:
				// En caso de que no se introduzca un caso de los que aparacen imprimimos
				// "opción no valida"
				System.out.println("Opción no válida, inténtalo de nuevo");
			}
		} while (opcion != 0);

		// Cerramos el Scanner
		sc.close();
	}

	// Creamos una clase para imprimir el menu y que nos devuelva la opción
	// seleccionada
	public static int menu() {
		// Creamos un Scanner, porque vamos a pedir un número
		Scanner sc = new Scanner(System.in);

		// Mostramos el menu y pedimos la opción
		System.out.println("Seleccione una opción --> ");
		System.out.println("[1] Perímetro");
		System.out.println("[2] Área");
		System.out.println("[0] Salir");

		// Devolvemos la opción
		return sc.nextInt();
	}

	// Creamos una clase para pedir el ancho del rectangulo
	public static double pideAncho() {
		// Creamos otro Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario el ancho del rectangulo y devolvemos el valor introducido
		System.out.print("Introduce el ancho del rectángulo --> ");
		return sc.nextDouble();
	}

	// Creamos una clase para pedir la altura del rectangulo
	public static double pideAlto() {
		// Creamos otro Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario la altura del rectangulo devolvemos el valor introducido
		System.out.print("Introduce el alto del rectángulo --> ");
		return sc.nextDouble();
	}
}
