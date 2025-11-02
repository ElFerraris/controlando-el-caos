package ControladorDelCaos;
import java.util.Scanner;
public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== Calculadora Básica ===");
        Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
 
		System.out.print("\rValor A: ");
		a = sc.nextInt();
		
		System.out.print("Valor B: ");
		b = sc.nextInt();
		
        System.out.println("\rSuma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));

	}
}
