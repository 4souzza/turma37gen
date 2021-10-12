package app;

import entities.Animal;

import entities.Doguinho;
import entities.Horse;
import entities.MacacoPrego;
public class app {

	public static void main(String[] args) {
		
		Animal doguinho1 = new Doguinho("bebel", 2 , true);
		Animal horse1 = new Horse("spike", 8 , true);
		Animal macacoPrego1 = new MacacoPrego("chico", 3, true);
				
				System.out.println(doguinho1.getNome());
		doguinho1.correr();
		doguinho1.isEmiteSom();
		System.out.println(horse1.getNome());
		horse1.correr();
		horse1.emitirSom();
	}

}
