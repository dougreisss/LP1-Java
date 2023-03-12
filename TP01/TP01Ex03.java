//NOMES; LUCAS AQUINO, DOUGLAS REIS

/**
 * 3. Calcular e exibir a �rea de um quadrado a partir do valor de sua diagonal que ser� digitado.
 */

import java.util.Scanner;

public class TP01Ex03 {
	public static void main(String[] args) {
		double diagonalQuadrado = 0;
		double diagonalElevado = 0;
		double areaQuadrado = 0;
		System.out.println("-------------------------------------------/");
		System.out.println("digite o tamanho da diagonal do seu quadrado:");
		Scanner scan = new Scanner(System.in);
		diagonalQuadrado = scan.nextDouble();
		System.out.println("-------------------------------------------/");

		diagonalElevado = diagonalQuadrado * diagonalQuadrado;
		areaQuadrado = diagonalElevado / 2;
		System.out.println("A area do quadrado : " + areaQuadrado + "                              ^ - ^");

	}

}