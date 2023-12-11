package ejercicio4;

import java.util.Scanner;

public class Cilindro {
		
		private double radio;
		private double altura;

		public Cilindro() {
		}

		public Cilindro(double radio, double altura) {
			this.radio = radio;
			this.altura = altura;
		}

		public double volumen() {
			return Math.PI * Math.pow(radio, 2) * altura;
		}

		public double area() {
			return 2 * Math.PI * radio * (altura + radio);
		
	}

}
