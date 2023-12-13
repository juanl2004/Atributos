package ejercicio2;

public class Rectangulo {

	//Creamos los atributos de la clase rectangulo
	double ancho;
	double alto;

	//Constructor que recibe dos parametros para inicializar (ancho y alto)
	public Rectangulo(double ancho, double alto) {
		// Inicialización de ancho con el valor 0
		this.ancho = ancho;
		// Inicialización de alto con el valor 0
	}

	//Metodo para resolver el perimetro del rectangulo
	public double perimetro() {
		//Devuelve la solución del perimetro
		return 2*ancho + 2*alto;
	}

	//Metodo para resolver el area del rectangulo
	public double area() {
		//Devuelve la solución del area
		return ancho * alto;
	}
}
