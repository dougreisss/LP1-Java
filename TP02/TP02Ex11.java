import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         11. Entrar com uma matriz de ordem MxM, onde a ordem também será
 *         escolhida pelo usuário,
 *         sendo que no máximo será de ordem 10 e quadrática. Após a digitação
 *         dos elementos,
 *         calcular e exibir determinante da matriz.
 */

public class TP02Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.println("Digite um valor: ");
        n = scanner.nextInt();
        double a[][] = new double[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.println("Digite um valor: ");
                a[i][j] = scanner.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    double ratio = a[j][i] / a[i][i];
                    for (int k = 0; k < n; k++)
                        a[j][k] -= ratio * a[i][k];
                }
            }
        }

        double det = 1.0;

        for (int i = 0; i < n; i++) {

            det *= a[i][i];

        }

        System.out.println("Determinante: " + det);
    }
}
