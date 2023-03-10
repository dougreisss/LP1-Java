import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a
 *         partir dos
 *         valores da velocidade inicial (em m/s), da aceleração (m/s2) e do
 *         tempo de percurso
 *         (em s) que serão digitados.
 */

public class TP01Ex13 {
    public static void main(String[] args) {

        double velocidadeInicial = 0;
        double valorAceleracao = 0;
        double tempoPercurso = 0;

        double velocidadeFinal = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da velocidade inicial: ");
        velocidadeInicial = scan.nextDouble();

        System.out.println("Digite o valor da aceleracao: ");
        valorAceleracao = scan.nextDouble();

        System.out.println("Digite o valor do tempo de percuso: ");
        tempoPercurso = scan.nextDouble();

        velocidadeFinal = velocidadeInicial + (valorAceleracao * tempoPercurso);

        System.out.println("A velocidade final: " + velocidadeFinal);
    }
}
