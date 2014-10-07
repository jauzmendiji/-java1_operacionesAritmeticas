import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de la suma y la resta de dos números.
 */
public class Main {

	public static void main (String args[]) {

		int numero1, numero2, resultadoMulti, resultadoDiv;
		Arithmetic operaciones = new Arithmetic();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa un número: ");
		numero1 = sc.nextInt();

		System.out.print("ingresa otro número: ");
		numero2 = sc.nextInt();

		resultadoMulti = operaciones.multi(numero1, numero2);
		resultadoDiv = operaciones.div(numero1, numero2);

		System.out.println("\nEl resultado de la MULTIPLICACION es: " + resultadoMulti);
		System.out.println("\nEl resultado de la DIVISION es: " + resultadoDiv);
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
