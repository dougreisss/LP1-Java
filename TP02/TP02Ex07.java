import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         7. Entrar via teclado com doze valores e armazená-los em uma matriz
 *         de ordem 3x4. Após a
 *         digitação dos valores solicitar uma constante multiplicativa, que
 *         deverá multiplicar cada
 *         valor matriz e armazenar o resultado na própria matriz, nas posições
 *         correspondentes.
 */

public class TP02Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double constante = 0;

        double m[][] = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um valor: ");
                m[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        System.out.println("Digite uma constante para multiplicacao: ");
        constante = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = m[i][j] * constante;
                System.out.println(m[i][j]);
            }
        }
    }
}
