//NOMES LUCAS AQUINO, DOUGLAS REIS

/**
 * 1. Entrar via teclado com a base e a altura de um ret�ngulo, calcular e exibir sua �rea.
 */

import java.util.Scanner;

public class TP01Ex01 {

	public static void main(String[] args) {
		double baseDoRetangulo = 0;
		double alturaDoRetangulo = 0;
		double areaRetangulo = 0;
		System.out.println("-------------------------------------------/");
		System.out.println("digite a base do seu retangulo: ");
		Scanner scan = new Scanner(System.in);
		baseDoRetangulo = scan.nextDouble();
		System.out.println("-------------------------------------------/");
		System.out.println("agora digite a altura do retangulo : ");
		alturaDoRetangulo = scan.nextDouble();
		System.out.println("-------------------------------------------/");
		areaRetangulo = baseDoRetangulo * alturaDoRetangulo;
		System.out.println("a area do retangulo: " + areaRetangulo + "                        ^ - ^");
		System.out.println("-------------------------------------------/");

	}

}