package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: 10 y 5 --> 1 | ENTRADA.ESPERADO: 30 | RES. ESPERADO: 30
 * ENTRADA.USUARIO: 10 y 5 --> 2 | ENTRADA.ESPERADO: 50 | RES. ESPERADO: 50
 * ENTRADA.USUARIO: 10 y 5 --> 0 | ENTRADA.ESPERADO: "Saliendo del programa" | RES. ESPERADO: "Saliendo del programa" 
 * ENTRADA.USUARIO: 5 y 10 --> 9 | ENTRADA.ESPERADO: "Opción no válida" | RES. ESPERADO: "Opción no válida"
*/

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

	// Creamos un método para imprimir el menu y que nos devuelva la opción
	// seleccionada
	public static int menu() {
		// Creamos un Scanner, porque vamos a pedir un número
		Scanner sc = new Scanner(System.in);

		int opcion;

		// Mostramos el menu y pedimos la opción
		System.out.println("Seleccione una opción --> ");
		System.out.println("[1] Perímetro");
		System.out.println("[2] Área");
		System.out.println("[0] Salir");

		// Bucle para asegurarse de que se introduce una opción válida
		do {
			System.out.print("Elija una opción: ");
			try {
				// Intenta leer un entero del usuario
				opcion = sc.nextInt();
				// Verifica si la opción está fuera del rango válido
				if (opcion < 0 || opcion > 2) {
					System.out.println("Opción no válida. Inténtelo de nuevo.");
				}
			} catch (InputMismatchException e) {
				// Captura la excepción si se introduce algo que no es un número entero
				System.out.println("Por favor, introduzca un número entero. Inténtelo de nuevo.");
				sc.nextLine(); // Limpia el búfer del Scanner
				opcion = -1; // Establece una opción inválida para repetir el bucle
			}
			// Repite el bucle si la opción no es válida
		} while (opcion < 0 || opcion > 2);

		// Devuelve la opción seleccionada por el usuario
		return opcion;
	}

	// Creamos un método para pedir el ancho del rectangulo
	public static double pideAncho() {
		// Creamos otro Scanner
		Scanner sc = new Scanner(System.in);

		double ancho;
		
		 // Bucle para asegurarse de que se introduce un ancho válido
        do {
            System.out.print("Introduzca el ancho del rectángulo --> ");
            try {
                // Intenta leer un número decimal del usuario
                ancho = sc.nextDouble();
                // Verifica si el ancho es menor o igual a cero
                if (ancho <= 0) {
                    System.out.println("El ancho debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    ancho = Double.NaN;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine(); 
             // Valor para indicar que el número es nulo
                ancho = Double.NaN; 
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(ancho)); 

        // Devuelve el ancho introducido por el usuario
        return ancho;
	}

	// Creamos un método para pedir la altura del rectangulo
	public static double pideAlto() {
		// Creamos otro Scanner
		Scanner sc = new Scanner(System.in);

		double alto;
		// Bucle para asegurarse de que se introduce un alto válido
        do {
            System.out.print("Introduzca el alto del rectángulo --> ");
            try {
                // Intenta leer un número decimal del usuario
                alto = sc.nextDouble();
                // Verifica si el alto es menor o igual a cero
                if (alto <= 0) {
                    System.out.println("El alto debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    alto = Double.NaN;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine(); 
                // Valor para indicar que el número es nulo
                alto = Double.NaN;
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(alto)); 

        // Devuelve el alto introducido por el usuario
        return alto;
	}
}
