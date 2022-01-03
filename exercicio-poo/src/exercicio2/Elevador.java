package exercicio2;

import java.util.Scanner;

public class Elevador {

	private double CapElevador;
	private int QtPessoas;
	int qtdMaxPessoas = 8;
	int qtdMaxElevador = 500;
	int npessoa;
	double ppessoa;

	public void inicializa() {
		
		CapElevador = 0;
		QtPessoas = 0;
		qtdMaxElevador = 500;
		qtdMaxPessoas = 8;
		
		Scanner entrada = new Scanner(System.in);
		for (int i = 1; i < 100; i++) {
			System.out.println(" entra ou sai ou fim");
			String decisao = entrada.nextLine();
			if (decisao.equals("entra")) {
				entra();

			}else if (decisao.equals("sai")) {
				sai();
			}
			else {
				if (decisao.equals("fim")) {
					break;
				}
			}
			
		}
		entrada.close();
	}

	public void entra() {
		if (CapElevador < qtdMaxElevador && QtPessoas < qtdMaxPessoas) {
			QtPessoas++;
			CapElevador = CapElevador + 80;
			System.out.println("pessoas no elevador " + QtPessoas);
			System.out.println("Capacidade do elevador " + CapElevador);
		} else {
			System.out.println("limite de pessoas no elevador ");
		}
	}

	public void sai() {
		if (QtPessoas > 0) {
			QtPessoas--;
			CapElevador = CapElevador - 80;
			System.out.println("pessoas no elevador " + QtPessoas);
			System.out.println("Capacidade do elevador " + CapElevador);
		} else {
			System.out.println("Não tem mais ninguem no elevador ");
		}

		// public void sobe() {
		// if (andar <= 10) {

		// }

		// }

	}

}
