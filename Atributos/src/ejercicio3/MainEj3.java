package ejercicio3;

import java.util.Scanner;

import ejercicio2.Rectangulo;

/*
 * ENTRADA.USUARIO: 5 --> 1 | ENTRADA.ESPERADO: 78.539 | RES. ESPERADO: 78.539
 * ENTRADA.USUARIO: 5 --> 2 | ENTRADA.ESPERADO: 31.415 | RES. ESPERADO: 31.415
 * ENTRADA.USUARIO: 5 --> 0 | ENTRADA.ESPERADO: "Saliendo del programa" | RES. ESPERADO: "Saliendo del programa" 
 * ENTRADA.USUARIO: 5 --> 9 | ENTRADA.ESPERADO: "Opción no válida" | RES. ESPERADO: "Opción no válida"
*/

public class MainEj3 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// LLamamos a la función pideRadio, para solictar el valor del radio al usuario
		double radio = pideRadio();

		// Llamamos a la clase circulo con el valor del radio
		Circulo circulo = new Circulo(radio);

		// Creamos la variable opción y llamamos al menú
		int opcion = menu();

		// Realizar acciones según la opción seleccionada
		switch (opcion) {
		case 1:
			//En el caso 1 imprimimos circunferencia, llamando a la función circunferencia
			System.out.println("Circunferencia --> " + circulo.circunferencia());
			//Cierre
			break;
		case 2:
			//En el caso 2 imprimimos el area llamando a la función area
			System.out.println("Área --> " + circulo.area());
			//Cierre
			break;
		case 0:
			//En el caso 0 imprimimos "Saliendo del programa"
			System.out.println("Saliendo del programa...");
			//Cierre
			break;
		default:
			//Si el caso es diferente al resto se imprimira "Opción no valida" 
			System.out.println("Opción no válida, inténtalo de nuevo");
		}
		//Cierre de Scanner
		sc.close();
	}

	//Creamos una clase para imprimir el menu
	public static int menu() {

		//Declaramos la opción que introducirá el menu por teclado
		int opcion;

		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		//Mostramos el menú y pedimos la opción
		System.out.println("Elige una de las opciones que se muestran a continuación -->");
		System.out.println("[1] Circunferencia");
		System.out.println("[2] Área");
		System.out.println("[0] Salir");
		opcion = sc.nextInt();

		//Devolvemos el valor introducido por el usuario
		return opcion;
	}

	//Creamos una clase para pedir el radio del circulo
	public static double pideRadio() {

		//Creamos la variable donde se guardara el valor introducido por el usuario
		double radio;

		//Creamos el Scanner 
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que intruzca el radio y leemos el valor introducido
		System.out.println("Introduce le radio -->");
		radio = sc.nextDouble();

		//Devolvemos el valor introducido por el usuario
		return radio;

	}
}
