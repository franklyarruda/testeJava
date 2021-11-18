package auladecondicao;

import java.util.Scanner;

public class ExercicioCondicao {
	
public static void main(String[] args) {
	
	int nasc;
	int idade, ano, idades;
	
	System.out.println("Digite o ano de nascimento ");
	Scanner entrada = new Scanner(System.in);
	nasc = entrada.nextInt();
	
	System.out.println("Digite o ano atual ");
	
	ano = entrada.nextInt();
	
	idade = nasc - ano;
	idades = Math.abs(idade);
	
	if (idades  >= 18) {
		
	System.out.println("Voce é de maior " + idades);	
		
	}else {
		
		System.out.println("Voce é de menor " + idades);
	}
	
	entrada.close();
	
	
	
}
	
	

}
