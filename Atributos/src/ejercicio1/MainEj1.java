package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEj1 {

	public static void main(String[] args) {
		int opc;
		double res, num1, num2;

		num1 = pideNumero();
		num2 = pideNumero();
		
		opc = menu();

		switch (res) {
		case 1: 
			res
		}
	}

	public static int menu() {
		int opc;

		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una de las funciones que se muestran a continuación -->");
		System.out.println("[1] Suma");
		System.out.println("[2] Resta");
		System.out.println("[3] Multiplicación");
		System.out.println("[4] División");
		System.out.println("[5] Máximo");
		System.out.println("[6] Mínimo");
		System.out.println("[0] Salir");

		System.out.println("Introduce el número de la opción que desees realizar ");
		opc = sc.nextInt();

		return opc;
	}

	public static double pideNumero() {
		double numero = 0;
		boolean seguir = true;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Escribe un número --> ");
				numero = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("El numero introducido es decimal");

			} finally {
				sc.nextLine();
			}
		} while (seguir);

		return numero;
	}
}
