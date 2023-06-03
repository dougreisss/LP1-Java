
/**
 * @author Douglas Reis e Lucas Aquino        
 */

import java.util.Scanner;
import java.text.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		this.setDia();
		this.setMes();
		this.setAno();
	}

	public Data(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}

	public void setDia(int d) {
		this.dia = d;
	}

	public void setMes(int m) {
		this.mes = m;
	}

	public void setAno(int a) {
		this.ano = a;
	}

	public boolean validarDia() {
		boolean valido = true;

		if (this.dia < 0 || this.dia > 32) {
			valido = false;
		}

		return valido;
	}

	public void setDia() {
		boolean controle = true;

		do {

			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Digite o valor do dia: ");
				this.setDia(scan.nextInt());

				if (!this.validarDia()) {
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

	public boolean validarMes() {
		boolean valido = true;

		if (this.mes < 0 || this.mes > 12) {
			valido = false;
		}

		if (this.mes == 2) {
			if (this.dia > 29) {
				valido = false;
			}
		}

		return valido;
	}

	public void setMes() {
		boolean controle = true;

		do {

			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Digite o valor do mes: ");
				this.setMes(scan.nextInt());

				if (!this.validarMes()) {
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

	public boolean validarAno() {
		boolean valido = true;

		if (this.ano < 0) {
			valido = false;
		}

		return valido;
	}

	public void setAno() {
		boolean controle = true;

		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Digite o valor do ano:  ");
				this.setAno(scan.nextInt());

				if (!this.validarAno()) {
					System.out.println("Valores invalidos");
					System.out.println("Por Favor, digite novamente os valores:   ");
					controle = true;
				} else {
					controle = false;
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} while (controle);

	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public String getDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	public String getDataFormatadaExtenso() {
		String mesExtenso = "";
		switch (this.mes) {
			case 1:
				mesExtenso = "Janeiro";
				break;
			case 2:
				mesExtenso = "Fevereiro";
				break;
			case 3:
				mesExtenso = "Março";
				break;
			case 4:
				mesExtenso = "Abril";
				break;
			case 5:
				mesExtenso = "Maio";
				break;
			case 6:
				mesExtenso = "Junho";
				break;
			case 7:
				mesExtenso = "Julho";
				break;
			case 8:
				mesExtenso = "Agosto";
				break;
			case 9:
				mesExtenso = "Setembro";
				break;
			case 10:
				mesExtenso = "Outubro";
				break;
			case 11:
				mesExtenso = "Novembro";
				break;
			case 12:
				mesExtenso = "Dezembro";
				break;

		}

		return this.dia + "/" + mesExtenso + "/" + this.ano;
	}

	public boolean getAnoBissexto() {
		boolean auxBissexto;

		if (this.ano % 400 == 0) {
			auxBissexto = true;

		} else if ((this.ano % 4 == 0) && (this.ano % 100 != 0)) {
			auxBissexto = true;
		} else {
			auxBissexto = false;
		}

		return auxBissexto;
	}

	public int getDiasTranscorridos() {
		LocalDateTime dataCadastro = LocalDateTime.of(this.ano, this.mes, this.dia, 0, 0, 0);
		LocalDateTime dataComparacao = LocalDateTime.of(this.ano, 1, 1, 0, 0, 0);

		long dias = dataComparacao.until(dataCadastro, ChronoUnit.DAYS);

		return (int) ++dias;
	}

	public void getDataAtual() {
		DateFormat DFormat = DateFormat.getDateInstance();

		String data = DFormat.format(new Date());

		System.out.println("A data de hoje: " + data);
	}
}