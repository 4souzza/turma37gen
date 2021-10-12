package entities;

public class Doguinho extends Animal {
	private boolean CapacidadeCorrer;

	public Doguinho(String nome, int idade, boolean capacidadecorrer) {
		super(nome, idade);
		this.CapacidadeCorrer = capacidadecorrer;
		
	}
	public boolean isCapacidadeCorrer() {
		return CapacidadeCorrer;

}
	public void setCapacidadeCorrer(boolean capacidadecorrer) {
		this.CapacidadeCorrer = capacidadecorrer;
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