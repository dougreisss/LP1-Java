
//NOMES; LUCAS AQUINO, DOUGLAS REIS
/**
 * 6. Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o
digitados.
 */

import java.util.Scanner;

public class TP01Ex06 {
	public static void main(String[] args) {
		double primeiroNumero = 0;
		double segundoNumero = 0;
		double terceiroNumero = 0;
		double quartoNumero = 0;
		double mediaAritimetica = 0;
		System.out.println("||-------------------------------------------||");
		System.out.println("    DIGITE O PRIMEIRO NUMERO:  ");
		Scanner scan = new Scanner(System.in);
		primeiroNumero = scan.nextDouble();
		System.out.println("||-------------------------------------------||");
		System.out.println("    DIGITE O SEGUNDO NUMERO:  ");
		segundoNumero = scan.nextDouble();
		System.out.println("||-------------------------------------------||");
		System.out.println("    DIGITE O TERCEIRO NUMERO:  ");
		terceiroNumero = scan.nextDouble();
		System.out.println("||-------------------------------------------||");
		System.out.println("    DIGITE O QUARTO NUMERO:  ");
		quartoNumero = scan.nextDouble();
		System.out.println("||-------------------------------------------||");

		mediaAritimetica = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) / 4;
		System.out.println("MEDIA ARITIMETICA ===>:  " + mediaAritimetica + "          ^_^");
	}
}