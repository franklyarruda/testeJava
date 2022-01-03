package exercicio1;

public class CalculoIdade {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
	
		pessoa.getNome();
		pessoa.idade();
		pessoa.getAltura();
		
		
		System.out.println(pessoa.getNome()+ " Idade " +pessoa.idade()+ " altura "+pessoa.getAltura());
		pessoa.pessoa("Franklyssdd", 2000, 1.55);
		System.out.println(pessoa.getNome() + pessoa.getAltura());
	
    
	
	}
}
