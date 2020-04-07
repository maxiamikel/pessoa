package aula20200406.aula;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso,altura;
	
	public Pessoa(String nome, int idade,double altura, double peso) {
		this.nome=nome;
		this.idade=idade;
		this.altura=altura;
		this.peso=peso;
	}
	public void setNome() {
		if(this.nome!="" || this.nome.length()>1 || this.nome!=null) {
			this.nome=nome;
		}
		else
		{
			System.out.println("ERRO");
		}
		
	}
	public String  getNome() {
		return this.nome;
	}
	public void setAltura() {
		if(this.altura>=25.00) {
			this.altura=altura;
		}
	}
	public double getAltura() {
		return this.altura;
	}
	public void setPeso() {
		this.peso=peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	public void setIdade() {
		this.idade=idade;
	}
	public int getIdade() {
		return this.idade;
	}

}
