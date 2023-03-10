import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         10. Entrar via teclado com o valor de uma temperatura em graus
 *         Celsius, calcular e
 *         exibir sua temperatura equivalente em Fahrenheit.
 */

public class TP01Ex10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double grausCelsius = 0;
		double grausFahrenheit = 0;

		System.out.println("Digite a tempetura em graus celsius");
		grausCelsius = scan.nextDouble();

		grausFahrenheit = (1.8 * grausCelsius) + 32;

		System.out.println("o valor da tempetatura em fahrenheit: " + grausFahrenheit);

	}

}