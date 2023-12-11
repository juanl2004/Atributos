package ejercicio1;

public class ClaseEj1 {

	double num1, num2;

	//Declaramos dos variables para almacenar el valor de dos números
	public ClaseEj1() {
	}

	//Clase que recibe dos parametros para inicializar (num1 y num2)
	public ClaseEj1(double num1, double num2) {
		//Llamada al constructor de la clase padre.
		super();
		// Inicialización de num1 con el valor pasado como parámetro
		this.num1 = num1;
		// Inicialización de num2 con el valor pasado como parámetro
		this.num2 = num2;
	}
	// Método para realizar la suma de num1 y num2
	public double suma() {
		//Devuelve la suma de num1 y num2
		return num1 + num2;
	}

	//Metodo para realizar la resta de num1 y num2
	public double resta() {
		//Devuelve la resta de num1 y num2	
		return num1 - num2; 
	}

	//Metodo para realizar la multiplicación de num1 y num2 
	public double multiplicacion() {
		//Devuelve el producto de num1 y num2
		return num1 * num2;
	}
	
	// Método para realizar la división de num1 entre num2
	public double division() {
		//Comprobamos que num2 es distinto de 0
		if (num2 != 0) {
	        //Devuelve el resultado de la división
			return num1 / num2;
		//Si no
		} else {
			//Se imprime "No es posible dividir entre cero"
	        System.out.println("No es posible dividir entre cero.");
	        return Double.NaN; 
	}
}
}