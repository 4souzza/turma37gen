package app;

import entities.Funcionario;
import entities.Terceiro;
public class TesteFun {

	public static void main(String[] args) {
	
			Funcionario func1 = new Funcionario("001", "EPAMINONDAS");
			Terceiro ter1 = new Terceiro("010", "MARIA",80.00);
			
			func1.setHoraTrabalhada(40);
			func1.setValorHora(10.00);
			
			
			ter1.setHoraTrabalhada(40);
			ter1.setValorHora(10.00);
			
			System.out.println("Sal�rio do funcion�rio"+func1.getNome()+ "R$" + func1.calculoSalario());
			System.out.println("Sal�rio do funcion�rio"+ter1.getNome()+ "R$" + ter1.calculoSalario());

	}

}
