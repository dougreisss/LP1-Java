
/**
 * @author Douglas Reis e Lucas Aquino        
 */

import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Hora {

	private int hora;
	private int min;
	private int seg;

	public Hora() {
		boolean controle = true;

		do {

			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Digite o valor da hora: ");
				this.setHor(scan.nextInt());

				System.out.println("Digite o valor do minuto: ");
				this.setMin(scan.nextInt());

				System.out.println("Digite o valor dos segundos: ");
				this.setSeg(scan.nextInt());

				if (!this.validarSegundos() || !this.validarHoras() || !this.validarMinutos()) {
					System.out.println("Valores invalidos");
					System.out.println("Por favor, digite novamente os valores");
					controle = true;
				} else {
					controle = false;
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} while (controle);
	}

	public Hora(int h, int m, int s) {
		this.setHor(h);
		this.setMin(m);
		this.setSeg(s);
	}

	public void setHor() {

		boolean controle = true;

		do {

			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Digite o valor da hora: ");
				this.setHor(scan.nextInt());

				if (!this.validarHoras()) {
					System.out.println("Valores invalidos");
					System.out.println("Por favor, digite novamente os valores");
					controle = true;
				} else {
					controle = false;
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} while (controle);
	}

	public void setMin() {

		boolean controle = true;

		do {

			try {
				Scanner scan = new Scanner(System.in);

				System.out.println("Digite o valor do minuto: ");
				this.setMin(scan.nextInt());

				if (!this.validarMinutos()) {
					System.out.println("Valores invalidos");
					System.out.println("Por favor, digite novamente os valores");
					controle = true;
				} else {
					controle = false;
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} while (controle);
	}

	public void setSeg() {

		boolean controle = true;

		do {

			try {
				Scanner scan = new Scanner(System.in);

				System.out.println("Digite o valor dos segundos: ");
				this.setSeg(scan.nextInt());

				if (!this.validarSegundos()) {
					System.out.println("Valores invalidos");
					System.out.println("Por favor, digite novamente os valores");
					controle = true;
				} else {
					controle = false;
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} while (controle);
	}

	public void setHor(int h) {
		this.hora = h;
	}

	public void setMin(int m) {
		this.min = m;
	}

	public void setSeg(int s) {
		this.seg = s;
	}

	public int getHor() {
		return this.hora;
	}

	public int getMin() {
		return this.min;
	}

	public int getSeg() {
		return this.seg;
	}

	public String getHora1() {
		String horaFormatada = "";

		horaFormatada = Integer.toString(this.getHor()) + ":" +
				Integer.toString(this.getMin()) + ":"
				+ Integer.toString(this.getSeg());

		return horaFormatada;
	}

	public String getHora2() {

		LocalTime time = LocalTime.of(this.getHor(), this.getMin(), this.getSeg());
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.US);
		String horaFormatada = fmt.format(time);

		return horaFormatada;
	}

	public int getSegundos() {
		int valorSegundos = 0;

		valorSegundos = (this.getHor() * 3600) + (this.getMin() * 60) + this.getSeg();

		return valorSegundos;
	}

	private boolean validarSegundos() {
		boolean valido = true;

		if (this.getSeg() < 0 || this.getSeg() >= 60) {
			valido = false;
		}

		return valido;
	}

	private boolean validarMinutos() {
		boolean valido = true;

		if (this.getMin() < 0 || this.getMin() >= 60) {
			valido = false;
		}

		return valido;
	}

	private boolean validarHoras() {
		boolean valido = true;

		if (this.getHor() < 0 || this.getHor() > 23) {
			valido = false;
		}

		return valido;
	}

}