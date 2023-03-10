import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         117. Entrar via teclado com dois valores quaisquer “X” e “Y”.
 *         Calcular e exibir o
 *         cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
 */

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorX = 0;
        double valorY = 0;
        double resultado = 0;

        System.out.println("Digite o primeiro valor: ");
        valorX = scan.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valorY = scan.nextDouble();

        resultado = Math.pow(valorX, valorY);

        System.out.printf("%f elevado a %f: %f", valorX, valorY, resultado);
    }
}
