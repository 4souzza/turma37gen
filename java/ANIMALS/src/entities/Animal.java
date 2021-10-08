package entities;

public class Animal {
	
	private String nome;
	private int idade;
	private boolean emiteSom;
	public Animal(String nome, int idade) {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	} 
	
	public void correr() {
		System.out.println("correndo feito maluco...");
	}
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	
	
}
