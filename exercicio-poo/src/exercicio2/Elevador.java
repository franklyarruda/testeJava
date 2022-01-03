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
		Scanner entrada = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			System.out.println(" entra ou sai ");
			String decisao = entrada.next();
			if (decisao == "entra") {
				
				System.out.println("Qual peso da pessoa ");
				ppessoa = entrada.nextDouble();
				
			}
		}
		CapElevador = 0;
		QtPessoas = 0;
		qtdMaxElevador = 500;
		qtdMaxPessoas = 8;
	}

	public void entra() {
		if (CapElevador < qtdMaxElevador && QtPessoas < qtdMaxPessoas) {
			QtPessoas += npessoa;
			CapElevador = CapElevador + ppessoa;
			System.out.println("pessoas no elevador " + QtPessoas);
			System.out.println("Capacidade do elevador " + CapElevador);
		} else {
			System.out.println("limite de pessoas no elevador ");
		}
	}

	public void sai() {
		if (QtPessoas >= 1) {
			QtPessoas -= npessoa;
			CapElevador = CapElevador - ppessoa;
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
