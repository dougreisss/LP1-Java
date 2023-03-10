import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         16. Entrar via teclado com o valor de um ângulo em graus, calcular e
 *         exibir as
 *         seguintes funções trigonométricas: seno, cosseno, tangente e secante
 *         deste ângulo.
 *         Lembre-se que uma função trigonométrica trabalha em radianos.
 */

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorGrau = 0;
        double valorSeno = 0;
        double valorCos = 0;
        double valorTan = 0;

        System.out.println("Digite o valor do angulo em graus: ");
        valorGrau = scan.nextDouble();

        valorGrau = Math.toRadians(valorGrau);

        valorSeno = Math.sin(valorGrau);
        valorCos = Math.cos(valorGrau);
        valorTan = Math.tan(valorGrau);

        System.out.println("O valor de seno: " + valorSeno);
        System.out.println("O valor de cosseno: " + valorCos);
        System.out.println("O valor da tangente: " + valorTan);

    }
}
