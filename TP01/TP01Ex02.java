import java.util.Scanner;

public class TP01Ex02 {
	public static void main(String[] args) {
		double arestaQuadrado = 0;
		double alturaQuadrado = 0;
		double arestaElevado = 0;
		double areaQuadrado = 0;
		System.out.println("-------------------------------------------/");

		System.out.println("DIGITE O TAMANHO DA ARESTA DO SEU QUADRADO:  ");
		Scanner scan = new Scanner(System.in);
		arestaQuadrado = scan.nextDouble();

		alturaQuadrado = arestaQuadrado;
		arestaElevado = arestaQuadrado * arestaQuadrado;

		System.out.println("A area do quadrado: " + arestaElevado);

	}
}