import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         9. Entrar com uma matriz de ordem MxN, onde a ordem também será
 *         escolhida pelo usuário,
 *         sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após
 *         a digitação dos
 *         elementos, calcular e exibir a matriz transposta.
 */

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordemM = 0;
        int ordemN = 0;

        System.out.println("Digite a ordem M: ");
        ordemM = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a ordem N: ");
        ordemN = Integer.parseInt(scanner.nextLine());

        if (ordemM > 10 || ordemN > 10) {
            do {

                System.out.println("Digite novamente a ordem M: ");
                ordemM = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite novamente a ordem N: ");
                ordemN = Integer.parseInt(scanner.nextLine());

            } while (ordemM > 10 || ordemN > 10);
        }

        double m[][] = new double[ordemM][ordemN];
        double t[][] = new double[ordemN][ordemM];

        for (int i = 0; i < ordemM; i++) {
            for (int j = 0; j < ordemN; j++) {
                System.out.println("Digite um valor: ");
                m[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        for (int i = 0; i < ordemM; i++) {
            for (int j = 0; j < ordemN; j++) {
                t[j][i] = m[i][j];
                System.out.println(t[j][i]);
            }
        }
    }
}
