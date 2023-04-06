/**
 * @author Douglas Reis e Lucas Aquino
 *         5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os
 *         valores na tela.
 */

public class TP02Ex05 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = i + j;
                System.out.println(matriz[i][j]);
            }
        }
    }
}