package entities;

public class Horse extends Animal {
	private boolean CapacidadeCoice;
	public Horse(String nome, int idade, boolean capacidadecoice) {
		super(nome, idade);
		this.CapacidadeCoice=capacidadecoice;
		
		
		
	}
	public boolean iscapacidadeCoice() {
		return CapacidadeCoice;
	}
	public void setcapacidadeCoice(boolean capacidadecoice) {
		this.CapacidadeCoice = capacidadecoice;
	}
	@Override
	public void correr() {
		
		System.out.println("Correndo e balançando a crina...");
	}
	@Override
	public void emitirSom() {
		
		System.out.println(" ririririririir ...");
	}
	
}
