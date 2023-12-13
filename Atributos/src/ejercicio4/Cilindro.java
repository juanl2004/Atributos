package ejercicio4;

import java.util.Scanner;

public class Cilindro {

	// Creamos el atributo radio y altura de la clase Cilindro
	double radio;
	double altura;

	// Creamos el constructor Cilindro para inicializar el radio y la altura
	public Cilindro(double radio, double altura) {
		// Inicialización del radio con el valor 0
		this.radio = radio;
		// Inicialización de la altura con el valor 0
		this.altura = altura;
	}

	// Método para resolver el volumen del cilindro
	public double volumen() {
		// Devolvemos el resultado del volumen aplicando su formula correspondiente
		return Math.PI * Math.pow(radio, 2) * altura;
	}

	// Método para resolver el area del cilindro
	public double area() {
		// Devolvemos el resultado del area aplicando la formula correspondiente
		return 2 * Math.PI * radio * (altura + radio);

	}

}
