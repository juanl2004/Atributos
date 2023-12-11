package ejercicio4;

import java.util.Scanner;

import ejercicio3.Circulo;

public class MainEj4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double radio = pideRadioBase();
		double altura = altura();

		Cilindro cilindro = new Cilindro(radio, altura);

		int opcion = menu();

		switch (opcion) {
		case 1:
			System.out.println("Volumen --> " + cilindro.volumen());
			break;
		case 2:
			System.out.println("Área --> " + cilindro.area());
			break;
		case 0:
			System.out.println("Saliendo del programa...");
			break;
		default:
			System.out.println("Opción no válida, inténtalo de nuevo");
		}
		sc.close();
	}

	public static int menu() {
		int opcion;

		Scanner sc = new Scanner(System.in);

		System.out.println("Elije una de las opciones -->");
		System.out.println("[1] Volumen");
		System.out.println("[2] Area");
		System.out.println("[01 Salir");
		opcion = sc.nextInt();

		return opcion;

	}

	public static double pideRadioBase() {
		double radio;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el radio de la base --> ");
		radio = sc.nextDouble();

		return radio;
	}

	public static double altura() {
		double altura;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la altura del cilindro --> ");
		altura = sc.nextDouble();

		return altura;
	}
}
