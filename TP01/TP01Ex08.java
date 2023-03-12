//NOMES; LUCAS AQUINO, DOUGLAS REIS

/**
 *8.  Sabendo que uma milha mar�tima equivale a um mil, oitocentos e cinquenta e dois metros e que um quil�metro possui mil metros, fazer um  *programa para converter milhas mar�timas em quil�metros.
 */

import java.util.Scanner;

public class TP01Ex08 {
	public static void main(String[] args) {

		double milhasNauticas = 0;
		double conversaoKm = 0;

		System.out.println("||-------------------------------------------||");
		System.out.println("    DIGITE A QUANTIDADE DE MILHAS DESEJADA:   ");
		Scanner scan = new Scanner(System.in);
		milhasNauticas = scan.nextDouble();

		conversaoKm = milhasNauticas * 1.852;

		System.out.println("||-------------------------------------------||");
		System.out
				.println("   CONVERSAO DE MILHAS NAUTICAS PRA KM ===>   " + conversaoKm + "KM" + "                ^-^");
		System.out.println("||---------------------FIM----------------------||");

	}

}