import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a
 *         partir dos
 *         valores da velocidade inicial (em m/s), da aceleração (m/s2) e do
 *         tempo de percurso
 *         (em s) que serão digitados.
 */

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] valorProduto = new double[5];
        double valorTotal = 0;
        double valorPagamento = 0;
        double valorTroco = 0;

        for (int i = 0; i < valorProduto.length; i++) {
            System.out.printf("Digite o valor do %dº produto: ", i + 1);
            valorProduto[i] = scan.nextDouble();
            valorTotal += valorProduto[i];
        }

        do {
            System.out.println("\nDigite o valor do pagamento: ");
            valorPagamento = scan.nextDouble();

            if (valorPagamento < valorTotal) {
                System.out.println("-----------------");
                System.out.printf("\nDigite um valor maior que %f", valorTotal);
            }

        } while (valorPagamento < valorTotal);

        valorTroco = valorPagamento - valorTotal;

        System.out.println("O valor do troco é: " + valorTroco);

    }
}
