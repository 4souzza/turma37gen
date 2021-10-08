package app;

import java.util.Scanner;

import entities.Eletronico;
import entities.Clientes;


public class eletroQuestao3 {

	public static void main(String[] args) {
		
		Eletronico elet1 = new Eletronico();
		Scanner leia = new Scanner(System.in);
		
		elet1.tipoPc = "Gamer";
		elet1.processadorPc = "Computador AMD Phenom";
		elet1.sistemaOperacional = "Windows, da Microsoft";
		elet1.memoriaRam = "8GB";
		elet1.hD = "1TB";
		
		elet1.tipoPc();
		elet1.exibirProcessadorPc();
		elet1.exibirSistemaOperacional();
		elet1.exibirMemoriaRam();
		elet1.exibirhD();
	}


	}


