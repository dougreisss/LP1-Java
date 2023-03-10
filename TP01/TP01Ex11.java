import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         11. A partir do diâmetro de um círculo que será digitado, calcular e
 *         exibir sua área.
 */

public class TP01Ex11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double diametro = 0;
		double area = 0;

		System.out.println("Digite o diametro de um circulo: ");
		diametro = scan.nextDouble();

		area = 0.25 * Math.PI * Math.pow(diametro, 2);

		System.out.println("A area do circulo: " + area);

	}

}