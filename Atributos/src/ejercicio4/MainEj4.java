package ejercicio4;

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

	// Creamos una clase para imprimir el menú
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
		opcion = sc.nextInt();

		// Devolvemos la opción introducida por el usuario
		return opcion;

	}

	// Creamos una clase para pedir el radio del circulo
	public static double pideRadioBase() {

		// Declaramos la variable donde se guarda el valor introducido por el usuario
		double radio;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el radio de la base y leemos el valor
		// introducido
		System.out.println("Introduzca el radio de la base --> ");
		radio = sc.nextDouble();

		// Devolvemos el valor introducido por el usuario
		return radio;
	}

	// Creamos otra clase para pedir la altura del cilindro
	public static double altura() {

		// Declaramos la variable donde se guarda el valor de la altura introducida por
		// el usuario
		double altura;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la altura y leemos el valor introducido
		System.out.println("Introduce la altura del cilindro --> ");
		altura = sc.nextDouble();

		// Devolvemos el valor introducido por el usuario
		return altura;
	}
}
