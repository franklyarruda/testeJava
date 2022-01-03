package exercicio1;

public class Pessoa {
	
	private String Nome = "Frankly";
	private int DataNascimento = 1990;
	private double altura = 1.89;
	
	public void pessoa(String Nome, int DataNascimento,double altura) {
		this.Nome = Nome;
		this.DataNascimento = DataNascimento;
		this.altura = altura;

	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	int idade(){
		int id = 2021 - DataNascimento;
		return id;
	}
	
	

}
