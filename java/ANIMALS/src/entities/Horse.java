package entities;

public class Horse extends Animal {
	private boolean CapacidadeCoice;
	public Horse(String nome, int idade, boolean capacidadeCoice) {
		super(nome, idade);
		this.CapacidadeCoice=capacidadeCoice;
		
		
		// TODO Auto-generated constructor stub
	}
	public boolean iscapacidadeCoice() {
		return CapacidadeCoice;
	}
	public void setcapacidadeCoice(boolean capacidadeCoice) {
		this.CapacidadeCoice = capacidadeCoice;
	}
	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Correndo e balançando a crina...");
	}
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println(" ririririririir ...");
	}
	
}
