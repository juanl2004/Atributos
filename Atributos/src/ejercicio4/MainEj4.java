package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio3.Circulo;

/*
 * ENTRADA.USUARIO: 4 y 8 --> 1 | ENTRADA.ESPERADO: 402.123 | RES. ESPERADO: 402.123
 * ENTRADA.USUARIO: 4 y 8 --> 2 | ENTRADA.ESPERADO: 301.592 | RES. ESPERADO: 301.592
 * ENTRADA.USUARIO: 5 --> 0 | ENTRADA.ESPERADO: "Saliendo del programa" | RES. ESPERADO: "Saliendo del programa" 
 * ENTRADA.USUARIO: 5 --> 9 | ENTRADA.ESPERADO: "Opción no válida" | RES. ESPERADO: "Opción no válida"
*/

public class MainEj4 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Llamamos a la función pideRadio, para solicitar el valor del radio al usuario
		double radio = pideRadioBase();
		// Volvemos a llamar a la función altura, para solicitar el valor del radio al
		// usuario
		double altura = altura();

		// Llamamos a la clase cilindro con el valor del radio y la altura
		Cilindro cilindro = new Cilindro(radio, altura);

		// Creamos la variable opcion y llamamos al menú
		int opcion = menu();

		// Realizamos los diferentes casos segin la opción seleccionada
		switch (opcion) {
		case 1:
			// En el caso 1 imprimimos el volumen, llamando a la función volumen de la clase
			// cilindro
			System.out.println("Volumen --> " + cilindro.volumen());
			// Cierre
			break;
		case 2:
			// En el caso 2 imprimimos el área, llamando a la función área de la clase
			// cilindro
			System.out.println("Área --> " + cilindro.area());
			// Cierre
			break;
		case 0:
			// En el caso 0 imprimos "Saliendo del programa..."
			System.out.println("Saliendo del programa...");
			// Cierre
			break;
		default:
			// Si el caso es diferente al resto se imprimira "Opción no valida"
			System.out.println("Opción no válida, inténtalo de nuevo");
		}
		// Cierre de Scanner
		sc.close();
	}

	// Creamos un método para imprimir el menú
	public static int menu() {

		// Declaramos la variable opción, que guardaró el valor introducido por el
		// usuario
		int opcion;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Mostramos todas las opciones del menú y pedimos una
		System.out.println("Elije una de las opciones -->");
		System.out.println("[1] Volumen");
		System.out.println("[2] Area");
		System.out.println("[01 Salir");

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
				// Limpiar Scanner
				sc.nextLine();
				// Establece una opción no valida para repetir el bucle
				opcion = -1;
			}
			// Repite el bucle si la opción no es válida
		} while (opcion < 0 || opcion > 2);

		// Devuelve la opción seleccionada por el usuario
		return opcion;

	}

	// Creamos un método para pedir el radio del circulo
	public static double pideRadioBase() {

		// Declaramos la variable donde se guarda el valor introducido por el usuario
		double radio;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle para asegurarse de que se introduce un radio válido
		do {
			System.out.print("Introduzca el radio de la base del cilindro: ");
			try {
				// Intenta leer un número decimal del usuario
				radio = sc.nextDouble();
				// Verifica si el radio es menor o igual a cero
				if (radio <= 0) {
					System.out.println("El radio de la base debe ser mayor que cero. Inténtelo de nuevo.");
					// Valor para indicar que el número es nulo
					radio = Double.NaN;
				}
			} catch (InputMismatchException e) {
				// Captura la excepción si se introduce algo que no es un número
				System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
				// Limpiar Scanner
				sc.nextLine();
				// Valor para indicar que el número es nulo
				radio = Double.NaN;
			}
			// Repite el bucle si el número no es válido
		} while (Double.isNaN(radio));

		// Devuelve el radio introducido por el usuario
		return radio;

	}

	// Creamos un método para pedir la altura del cilindro
	public static double altura() {

		// Declaramos la variable donde se guarda el valor de la altura introducida por
		// el usuario
		double altura;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		 // Bucle para asegurarse de que se introduce una altura válida
        do {
            System.out.print("Introduzca la altura del cilindro: ");
            try {
                // Intenta leer un número decimal del usuario
                altura = sc.nextDouble();
                // Verifica si la altura es menor o igual a cero
                if (altura <= 0) {
                    System.out.println("La altura del cilindro debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    altura = Double.NaN;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine();
                // Valor para indicar que el número es nulo
                altura = Double.NaN;
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(altura));

        // Devuelve la altura introducida por el usuario
        return altura;
		
	}
}
