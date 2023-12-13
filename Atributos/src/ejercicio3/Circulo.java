package ejercicio3;

public class Circulo {

	// Creamos el atributo radio de la clase Circulo
	double radio;

	// Creamos el constructor Circulo para inicializar el radio
	public Circulo(double radio) {
		// Inicialización del radio con el valor 0
		this.radio = radio;
	}

	// Metodo para resolver la circunferencia del Circulo
	public double circunferencia() {
		// Devolvemos el resultado
		return Math.PI * Math.pow(radio, 2);
	}

	// Metodo para resolver el area del Circulo
	public double area() {
		// Devolvemos el resultado
		return 2 * Math.PI * radio;
	}
}
