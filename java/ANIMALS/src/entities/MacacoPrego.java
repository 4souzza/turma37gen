package entities;

public class MacacoPrego extends Animal {
	private boolean CapacidadePular;
	
	public MacacoPrego(String nome, int idade, boolean capacidadePular) {
		super(nome, idade);
		this.CapacidadePular = capacidadePular;
		
		// TODO Auto-generated constructor stub
	}

	public boolean isCapacidadePular() {
		return CapacidadePular;
	}

	public void setCapacidadePular(boolean capacidadePular) {
		CapacidadePular = capacidadePular;
	} 	
	public void somFolhas() {
		System.out.println("barulho de folhas sendo pisadas....");
}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Correndo em velocidade media...");
	}
	
}

