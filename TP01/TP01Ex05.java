//NOMES; LUCAS AQUINO, DOUGLAS REIS

/**
 *5. Calcular e exibir o volume de uma esfera a partir do valor de seu di�metro que ser� digitado.
 */

import java.util.Scanner;

public class TP01Ex05 {
	public static void main(String[] args) {
		double volumeEsfera = 0;
		double diametroEsfera = 0;
		double raioEsfera = 0;
		double pI = 3.14159;

		System.out.println("----------------------------------------------/");

		System.out.println("DIGITE O DIAMETRO DA ESFERA :  ");
		Scanner scan = new Scanner(System.in);
		diametroEsfera = scan.nextDouble();
		raioEsfera = diametroEsfera / 2.0;
		volumeEsfera = (4.0 / 3.0) * pI * Math.pow(raioEsfera, 3);

		System.out.println("----------------------------------------------/");
		System.out.println("VOLUME DA ESFERA : " + volumeEsfera);

		System.out.println("-------------------FIM------------------------/");

	}

}