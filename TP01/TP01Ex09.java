import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         9. Calcular e exibir a tensão de um determinado circuito eletrônico a
 *         partir dos
 *         valores da resistência e corrente elétrica que serão digitados.
 *         Utilize a lei de Ohm.
 */

public class TP01Ex09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valorCorrente = 0;
		double valorResistencia = 0;

		double valorTensao = 0;

		System.out.println("Digite o valor da ressitência: ");
		valorResistencia = scan.nextDouble();

		System.out.println("Digite o valor da corrente: ");
		valorCorrente = scan.nextDouble();

		valorTensao = valorCorrente * valorResistencia;

		System.out.println("O valor da tensao é: " + valorTensao);

	}

}