package entities;

public class MacacoPrego extends Animal {
	private boolean CapacidadePular;
	
	public MacacoPrego(String nome, int idade, boolean capacidadepular) {
		super(nome, idade);
		this.CapacidadePular = capacidadepular;
		
		
	}

	public boolean isCapacidadePular() {
		return CapacidadePular;
	}

	public void setCapacidadePular(boolean capacidadepular) {
		CapacidadePular = capacidadepular;
	} 	
	public void somFolhas() {
		System.out.println("barulho de folhas sendo pisadas....");
}

	@Override
	public void correr() {
		
		System.out.println("Correndo em velocidade media...");
	}
	
}

