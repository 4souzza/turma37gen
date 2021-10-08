package entities;

public class Doguinho extends Animal {
	private boolean CapacidadeCorrer;

	public Doguinho(String nome, int idade, boolean capacidadeCorrer) {
		super(nome, idade);
		this.CapacidadeCorrer = capacidadeCorrer;
		
	}
	public boolean isCapacidadeCorrer() {
		return CapacidadeCorrer;

}
	public void setCapacidadeCorrer(boolean capacidadeCorrer) {
		this.CapacidadeCorrer = capacidadeCorrer;
}
	@Override
	public void correr() {
		System.out.println("Correndo fofinho...");
}
	@Override
	public void emitirSom() {
		System.out.println("au au au...");
	}
}