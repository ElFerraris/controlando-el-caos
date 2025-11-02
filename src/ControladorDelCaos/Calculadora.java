package ControladorDelCaos;

public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== Calculadora Básica ===");
        int a = 10;
        int b = 5;
    
		double porcentaje;
		
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));

   		porcentaje = ((double) a / b) * 100;
        System.out.println("Porcentaje de a respecto a b: " + porcentaje + "%");
		
		System.out.println("Final Calculadora");
	}
}
// Creando la rama potencia
