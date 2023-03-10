import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 *         15. Entrar via teclado com o valor da cotação do dólar e uma certa
 *         quantidade de
 *         dólares. Calcular e exibir o valor correspondente em Reais (R$).
 */

public class TP01Ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cotacaoDolar = 0;
        double qtdDolar = 0;
        double qtdReais = 0;

        System.out.println("Digite a cotacao do dolar: ");
        cotacaoDolar = scan.nextDouble();

        System.out.println("Digite a quantidade de dolares: ");
        qtdDolar = scan.nextDouble();

        qtdReais = cotacaoDolar * qtdDolar;

        System.out.println("O valor em reais: " + qtdReais);

    }
}
