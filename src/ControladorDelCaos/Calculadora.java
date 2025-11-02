package ControladorDelCaos;
import java.util.Scanner;
public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== Calculadora Básica ===");
        Scanner sc = new Scanner(System.in);  // Scanner
		int a = 0, b = 0;
 		double porcentaje;
    
		System.out.print("\rValor A: ");
		a = sc.nextInt();
		
		System.out.print("Valor B: ");
		b = sc.nextInt();
    
        System.out.println("\rSuma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));

//Prueba pull request
   		porcentaje = ((double) a / b) * 100;
        System.out.println("Porcentaje de a respecto a b: " + porcentaje + "%");
		
		System.out.println("Final Calculadora");
	}
}
// Creando la rama potencia
