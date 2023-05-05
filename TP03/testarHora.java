
/**
 * @author Douglas Reis e Lucas Aquino        
 */

import java.util.Scanner;

public class testarHora {
	public static void main(String[] args) {
		Hora classeHora = new Hora();

		System.out.println("O valor da hora: " + classeHora.getHor());
		System.out.println("O valor dos minutos: " + classeHora.getMin());
		System.out.println("O valor dos segundos: " + classeHora.getSeg());

		System.out.println("Hora: " + classeHora.getHora1());
		System.out.println("Hora AM/PM: " + classeHora.getHora2());
		System.out.println("Totais segundos: " + classeHora.getSegundos());

		System.out.println("----------------------------------");

		int hora, segundos, minutos = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora: ");
		hora = scan.nextInt();

		System.out.println("Digite o valor dos minutos: ");
		minutos = scan.nextInt();

		System.out.println("Digite o valor dos segundos: ");
		segundos = scan.nextInt();

		Hora classeHora2 = new Hora(hora, minutos, segundos);

		System.out.println("O valor da hora: " + classeHora2.getHor());
		System.out.println("O valor dos minutos: " + classeHora2.getMin());
		System.out.println("O valor dos segundos: " + classeHora2.getSeg());

		System.out.println("Hora: " + classeHora2.getHora1());
		System.out.println("Hora AM/PM: " + classeHora2.getHora2());
		System.out.println("Totais segundos: " + classeHora2.getSegundos());

		System.out.println("--------------------------------------------");

		classeHora2.setHor();
		classeHora2.setMin();
		classeHora2.setSeg();

		System.out.println("O valor da hora: " + classeHora2.getHor());
		System.out.println("O valor dos minutos: " + classeHora2.getMin());
		System.out.println("O valor dos segundos: " + classeHora2.getSeg());

		System.out.println("Hora: " + classeHora2.getHora1());
		System.out.println("Hora AM/PM: " + classeHora2.getHora2());
		System.out.println("Totais segundos: " + classeHora2.getSegundos());

	}
}