import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         12. Calcular e exibir o volume de um cone a partir dos valores da
 *         altura e do raio da
 *         base que serão digitados.
 */

public class TP01Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double altura = 0;
		double raioBase = 0;
		double volume = 0;

		System.out.println("Digite o valor da altura: ");
		altura = scan.nextDouble();

		System.out.println("Digite o valor do raio da base: ");
		raioBase = scan.nextDouble();

		volume = (Math.PI * Math.pow(raioBase, 2) * altura) / 3;

		System.out.println("Valor do volume: " + volume);

	}

}