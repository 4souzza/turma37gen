package Lista01;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		int ano;
		int mes;
		int dia;
		int totalDias;
		
		System.out.println("Digite sua idade");
		
		ano =leia.nextInt();
		
		System.out.println("Digite quantos meses");
		
		mes = leia.nextInt();
		
		System.out.println("Digite quantos dias");
		
		dia = leia.nextInt();
		
		ano = ano*365;
		mes = mes*30;
		
		totalDias = ano + mes + dia;
		
		System.out.printf("O total de dias ?: %d", totalDias);
	}

}
