
//NOMES; LUCAS AQUINO, DOUGLAS REIS
/**
 * 7. Calcular e exibir a m�dia geom�trica de dois valores quaisquer que ser�o digitados.
 */

import java.util.Scanner;

public class TP01Ex07 {
	public static void main(String[] args) {

		double primeiroNumero = 0;
		double segundoNumero = 0;
		double mediaGeometrica = 0;

		System.out.println("||-------------------------------------------||");
		System.out.println("    DIGITE O PRIMEIRO NUMERO:  ");
		Scanner scan = new Scanner(System.in);
		primeiroNumero = scan.nextDouble();
		System.out.println("||-------------------------------------------||");
		System.out.println("    DIGITE O SEGUNDO NUMERO:  ");
		segundoNumero = scan.nextDouble();
		System.out.println("||-------------------------------------------||");

		mediaGeometrica = Math.sqrt(primeiroNumero * segundoNumero);
		System.out.println("MEDIA GEOMETRICA ===>:  " + mediaGeometrica + "          ^_^");
	}

}