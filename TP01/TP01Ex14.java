import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         14. Calcular e exibir o volume livre de um ambiente que contém uma
 *         esfera de raio
 *         “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e
 *         “a” serão
 *         digitados.
 */

public class TP01Ex14 {
    public static void main(String[] args) {

        double valorEsfera = 0;
        double arestaCubo = 0;
        double volumeEsfera = 0;
        double volumeCubo = 0;
        double valorLivre = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        valorEsfera = scan.nextDouble();

        System.out.print("Digite a aresta do cubo: ");
        arestaCubo = scan.nextDouble();

        volumeCubo = Math.pow(arestaCubo, 3);
        volumeEsfera = (4 * Math.PI * Math.pow(valorEsfera, 3)) / 3;
        valorLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume livre é " + valorLivre);
    }
}
