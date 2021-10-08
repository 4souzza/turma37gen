package entities;

public class produtos {

	public String nome;
	public int estoque;
	public String codigo;
	public double valor;
	
	public void tirarEstoque(int quantidade) {
		
		estoque = estoque - quantidade;
		
	}
	public void colocarEstoque(int quantidade) {
		
		estoque = estoque + quantidade;
		
}
	
}

