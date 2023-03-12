//NOMES: LUCAS AQUINO, DOUGLAS REIS

/**
 * 4. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea.
 */

import java.util.Scanner;

public class TP01Ex04 {
	public static void main(String[] args) {
		double alturaTriangulo = 0;
		double baseTriangulo = 0;
		double areaTriangulo = 0;
		System.out.println("DIGITE A ALTURA DO SEU TRIANGULO:  ");
		Scanner scan = new Scanner(System.in);
		alturaTriangulo = scan.nextDouble();
		System.out.println("-------------------------------------------/");
		System.out.println("DIGITE A BASE DO SEU TRIANGULO:  ");
		baseTriangulo = scan.nextDouble();
		System.out.println("-------------------------------------------/");

		areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		System.out.println(" AREA DO TRIANGULO:  " + areaTriangulo + "                      ^ - ^");

	}
}