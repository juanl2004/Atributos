package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: 5 y 10 --> 1 | ENTRADA.ESPERADO: 15 | RES. ESPERADO: 15
 * ENTRADA.USUARIO: 10 y 0 --> 4 | ENTRADA.ESPERADO: "No es posible dividir entre 0" | RES. ESPERADO: "No es posible dividir entre 0"
 * ENTRADA.USUARIO: 5 y 10 --> 0 | ENTRADA.ESPERADO: "Saliendo del programa" | RES. ESPERADO: "Saliendo del programa" 
 * ENTRADA.USUARIO: 5 y 10 --> 9 | ENTRADA.ESPERADO: "Opción no válida" | RES. ESPERADO: "Opción no válida"
*/

public class MainEj1 {

	public static void main(String[] args) {
		// Almacenamos la opción del menú seleccionada por el usuario
		int opc;
		// Variable para almacenar el resultado y los dos números con los que operamos
		double res, num1, num2;

		// Almacenamos el valor de los dos números
		num1 = pideNumero();
		num2 = pideNumero();

		//Mostramos el menú y obtenemos la opción del usuario
		opc = menu();

		//Llamamos a la clase "ClaseEj1" con los números proporcionados (num1 y num2)
		ClaseEj1 calculadora = new ClaseEj1(num1, num2);

        // Realizar acciones según la opción seleccionada
		switch (opc) {
		case 1:
			//Llamamos a la función suma y mostramos el resultado.
			res = calculadora.suma();
			System.out.println("Resultado de la suma: " + res);
			//Cierre
			break;
		case 2:
			//Llamamos a la función resta y mostramos su resultado
			res = calculadora.resta();
			System.out.println("Resultado de la resta: " + res);
			//Cierre
			break;
		case 3:
			//Llamamos a la función multiplicación y mostramos su solución
			res = calculadora.multiplicacion();
			System.out.println("Resultado de la multiplicación: " + res);
			//Cierre
			break;
		case 4:
			//Llamamos a la función división y mostramos su resultado
			res = calculadora.division();
			System.out.println("Resultado de la división: " + res);
			//Cierre
			break;
		case 5:
			//El resultado es igual al maximo de entre los dos números
			res = Math.max(num1, num2);
			System.out.println("Máximo: " + res);
			//Cierre
			break;
		case 6:
			//El resultado es igual al minimo de entre los dos números
			res = Math.min(num1, num2);
			System.out.println("Mínimo: " + res);
			//Cierre
			break;
		case 0:
			//En caso de que introduzcamos 0 el programa terminara mostrandonos "Saliendo del programa..."
			System.out.println("Saliendo del programa...");
			//Cierre
			break;
		default:
			//Si se introduce otro número de los que no aparecen en el menú se imprime "Opción no válida"
			System.out.println("Opción no válida");
		}
	}
	//Método para mostrar el menú y obetener la opción del usuario
	public static int menu() {
		//Guardamos la opción introducida por el usuario
		int opc;

		//Creamos el Scanner para mostrar una solución
		Scanner sc = new Scanner(System.in);
		
		//Creamos el menú
		System.out.println("Elige una de las funciones que se muestran a continuación -->");
		System.out.println("[1] Suma");
		System.out.println("[2] Resta");
		System.out.println("[3] Multiplicación");
		System.out.println("[4] División");
		System.out.println("[5] Máximo");
		System.out.println("[6] Mínimo");
		System.out.println("[0] Salir");

		//Le pedimos al usuario que introduzca la opción
		System.out.println("Introduce el número de la opción que desees realizar ");
		opc = sc.nextInt();

		//Se devuelve el valor de opc al lugar donde se llame
		return opc;
	}
	//Método para solicitar y obtener un número del usuario
	public static double pideNumero() {
		// Variable para almacenar el número introducido por el usuario
		double numero = 0;
		//Iniciamos la variable seguir en true, para controlar el bucle de entrada
		boolean seguir = true;

		//Creamos Scanner
		Scanner sc = new Scanner(System.in);

		do {
			try {
				//Pedimos un número
				System.out.println("Escribe un número --> ");
				numero = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				//Se muestra si el valor introducido es erroneo, en este caso "decimal"
				System.out.println("El numero introducido es decimal");

			} finally {
                // Limpiar el buffer del scanner para evitar bucles infinitos
				sc.nextLine();
			}
		//Comprobamos el valor del seguir	
		} while (seguir);

		//Se devuelve el valor de opc al lugar donde se llame
		return numero;
	}
}
